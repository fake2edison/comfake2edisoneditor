package com.fake2edison.rest;

import com.fake2edison.entity.Common;
import com.fake2edison.entity.User;
import com.fake2edison.rpc.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fake2edison on 2019/4/9.
 */
@Controller
@RequestMapping(value = "/material")
public class MaterialController {
    @Autowired
    private CommonService commonService;

    @RequestMapping(value = "/getMateri",method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Common> getMateri(@RequestParam("code") String code,@RequestParam("item") int item){
        ArrayList<Common> commonArrayList = commonService.getCommon(code,item);
        return commonArrayList;
    }

    @RequestMapping(value = "/getFavoriteCommon",method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Common> getFavoriteCommon(HttpServletRequest request,@RequestParam("code") String code,@RequestParam("item") int item){
        HttpSession session = request.getSession();
        ArrayList<Common> commonArrayList = new ArrayList<Common>();
        User user = (User)session.getAttribute("USER");
        if(!("").equals(user.getId())){
            commonArrayList = commonService.getFavoriteByUserId(user.getId(),code,item);
        }
        return commonArrayList;
    }

    @RequestMapping(value = "/selectCommonByPage",method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Common> selectCommonByPage(@RequestParam("pre_page")int pre_page,@RequestParam("last_page")int last_page){
        ArrayList<Common> commonArrayList = new ArrayList<Common>();
        commonArrayList = commonService.selectCommonByPage(pre_page,last_page);
        return commonArrayList;
    }

    @RequestMapping(value = "/addHot", method = RequestMethod.POST)
    @ResponseBody
    public String addHot(@RequestParam("menu_uuid") String uuid){
        int count = commonService.addStyleHot(uuid);
        if(count == 1){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }

    @RequestMapping(value = "/countStyle",method = RequestMethod.GET)
    @ResponseBody
    public int countStyle(){
        int count = commonService.countStyle();
        return count;
    }
}
