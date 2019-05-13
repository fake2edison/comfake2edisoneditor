package com.fake2edison.rest;

import com.fake2edison.entity.Template;
import com.fake2edison.entity.User;
import com.fake2edison.rpc.service.TemplateService;
import com.fake2edison.util.UuidUtil;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by fake2edison on 2019/4/21.
 */
@Controller
@RequestMapping(value = "/template")
public class TemplateController {
    @Autowired
    private TemplateService templateService;

    /**
     * 插入模版类型
     * @param request
     * @param title
     * @param content
     * @param summary
     * @param statue
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public String insertTemplate(HttpServletRequest request, @RequestParam("title") String title, @RequestParam("content") String content, @RequestParam("summary") String summary, @RequestParam("statue") int statue, @RequestParam("templateimg") String templateimg){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        int id = user.getId();
        Calendar cal=Calendar.getInstance();
        Date date = cal.getTime();
        int result = templateService.insertTemplate(id,date,title,summary,content,statue,templateimg);
        return result+"";
    }

    /**
     * 根据uid获取个人模版
     * @param request
     * @return
     */
    @RequestMapping(value = "/getTemplate",method = RequestMethod.GET)
    @ResponseBody
    public List<Template> getTemplateByUserId(HttpServletRequest request,@RequestParam("page") int page){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        int id = user.getId();
        List<Template> templateList = new ArrayList<Template>();
        templateList = templateService.getTemplateByUser(id,page);
        return templateList;
    }

    /**
     * 获取所有的模版
     * @return
     */
    @RequestMapping(value = "/getAllTemplate",method = RequestMethod.GET)
    @ResponseBody
    public List<Template> getAllTemplate(@Param("page") int page){
        List<Template> templateList = new ArrayList<Template>();
        templateList = templateService.getAllTemplate(page);
        return templateList;
    }

    /**
     * 图片上传
     * @param file
     * @return
     */
    @RequestMapping(value = "/uploadFile",method = RequestMethod.POST)
    @ResponseBody
    public String uploadFile(HttpServletRequest request,@RequestParam("file")MultipartFile file){
        Map<String, String> resObj = new HashMap<>();
        Gson gson = new Gson();
        if(!file.isEmpty()){
            try{
//                String UPLOAD_FILE_PATH = "//Users/fake2edison/Desktop/ieditor/static/img/";
                String UPLOAD_FILE_PATH = "//usr/local/src/vue/dist/static/img";
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String fileName = sdf.format(calendar.getTime()) + UuidUtil.getUUID() + file.getOriginalFilename();
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(UPLOAD_FILE_PATH, fileName)));
                out.write(file.getBytes());
                out.flush();
                out.close();
                Thread.sleep(2000);
                resObj.put("msg","success");
                resObj.put("code","0");
                resObj.put("src",fileName);
                return gson.toJson(resObj);
            }catch (IOException e){
                resObj.put("msg", "error");
                resObj.put("code", "1");
                return gson.toJson(resObj);
            } catch (InterruptedException e) {
                e.printStackTrace();
                resObj.put("msg", "error");
                resObj.put("code", "2");
                return gson.toJson(resObj);
            }
        }else {
            return null;
        }
    }

}