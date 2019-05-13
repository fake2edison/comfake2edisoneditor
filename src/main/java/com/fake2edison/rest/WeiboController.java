package com.fake2edison.rest;

import com.fake2edison.entity.*;
import com.fake2edison.rpc.service.*;
import com.fake2edison.weibo4j.Oauth;
import com.fake2edison.weibo4j.Timeline;
import com.fake2edison.weibo4j.Users;
import com.fake2edison.weibo4j.http.AccessToken;
import com.fake2edison.weibo4j.model.Status;
import com.fake2edison.weibo4j.model.WeiboException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by fake2edison on 2019/5/10.
 */

@Controller
@RequestMapping(value = "/weibo")
public class WeiboController {

    @Autowired
    private WeiboService weiboService;

    @Autowired
    private WeiboUserService weiboUserService;

    @Autowired
    private TemplateService templateService;

    @Autowired
    private SyncHistoryService syncHistoryService;

    @RequestMapping(value = "/auth",method = RequestMethod.POST)
    @ResponseBody
    public void getUserCode(HttpServletRequest request, @RequestParam("code") String code){

        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        int count = 0;
        int countweibo = 0;
//        验证用户是否登陆
        if(user != null){
            System.out.println(code);
            //获得code 通过微博的Auth方法去获取token
            Oauth oauth = new Oauth();
            try{
                AccessToken as = oauth.getAccessTokenByCode(code);
                String access_token = as.getAccessToken();
                String uid = as.getUid();
                //判断uid是否存在
                ArrayList<WeiboUser> weiboUserArrayList = weiboUserService.isExitUid(uid);
                if(weiboUserArrayList.size()>0){
                    return;
                }else {
                    Users um = new Users(access_token);
                    com.fake2edison.weibo4j.model.User userWeibo = um.showUserById(uid);
                    String userNameWeibo = userWeibo.getName();
                    //成功获取到token
                    //此时应该添加token至数据库中
                    count = weiboService.insertWeibo(uid,userNameWeibo,access_token);
                    //当count为1时，添加微博账号成功
                    //添加微博-用户关系表
                    countweibo = weiboUserService.insertWeiboUser(user.getId(),uid);
                }
            }catch (WeiboException e){
                if(401 == e.getStatusCode()){
//                    Log.logInfo("Unable to get the access token.");
                    System.out.println("Unable to get the access token.");
                }else{
                    e.printStackTrace();
                }
            }
        }
        return;
    }

    @RequestMapping(value = "/getAuthAccount",method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Weibo> getAuthAccount(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        ArrayList<Weibo> weiboArrayList = new ArrayList<Weibo>();
        if(user != null){
            //说明已经登陆
            //拿着uid去关联表查询wid 拿着wid去weibo表查询name和uid
            ArrayList<String> widList = weiboUserService.getWidByUid(user.getId());
            if(widList!=null && widList.size()>0){
                for(String wid : widList){
                    Weibo weibo = weiboService.selectWeiboByWid(wid);
                    if(weibo!=null){
                        weiboArrayList.add(weibo);
                    }
                }
            }
        }
        return weiboArrayList;
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    @ResponseBody
    public String send(HttpServletRequest request, @RequestParam("wid")String wids, @RequestParam("contentid") String contentids){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        String[] wid = wids.split(";");
        String[] contentid = contentids.split(";");
        if(user != null){
            //根据contentid获取到文章的信息
            if(contentid.length>0){
                for (String cid : contentid){
                    Template template = templateService.getTemplateById(Integer.parseInt(cid));
                    if(template!=null){
                        if(wid.length>0){
                            for(String id : wid){
                                //获取到每一个id
                                //获取weibo的asstoken
                                Weibo weibo = weiboService.selectWeiboByWidAll(id);
                                String asstoken = weibo.getAccesstoken();
                                String url = "http://www.iws365.com";
                                //发送
                                Timeline tm = new Timeline(asstoken);
                                try {
                                    Status status = tm.updateStatus(template.getContent()+url);
                                    //添加同步记录
                                    int count = syncHistoryService.insertSyncHistory(user.getId(),id,Integer.parseInt(cid),weibo.getName(),template.getTitle());
                                    if(count!=1){
                                        return "插入数据库失败";
                                    }
                                    Thread.sleep(2000);
                                } catch (WeiboException e) {
                                    e.printStackTrace();
                                    return "发送微博失败";
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        }else {
                            return "模版ID为空";
                        }
                    }else {
                        return "模版ID获取失败";
                    }
                }
                return "发送成功";
            }else {
                return "文章ID获取失败";
            }

        }else {
            return "请先登陆";
        }
    }

    @RequestMapping(value = "/getSyncRecord",method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<SyncHistory> getSyncRecord(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        ArrayList<SyncHistory> syncHistoryArrayList = new ArrayList<SyncHistory>();
        if(user != null){
            syncHistoryArrayList = syncHistoryService.selectSyncHistoryByUserId(user.getId());
        }
        return syncHistoryArrayList;
    }

    @RequestMapping(value = "/selectSyncRecord",method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<SyncHistory> selectSyncRecord(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        ArrayList<SyncHistory> syncHistoryArrayList = new ArrayList<SyncHistory>();
        if(user != null && user.getIs_admin() == 1){
            syncHistoryArrayList = syncHistoryService.selectSyncRecord();
        }
        return syncHistoryArrayList;
    }

    @RequestMapping(value = "/selectSyncCount",method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<SyncMap> selectSyncCount(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        ArrayList<SyncMap> syncMapArrayList = new ArrayList<SyncMap>();
        if(user != null && user.getIs_admin() == 1){
            syncMapArrayList = syncHistoryService.countSync();
        }
        return syncMapArrayList;
    }

}
