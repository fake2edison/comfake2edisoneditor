package com.fake2edison.rpc.service;

import com.fake2edison.entity.Template;
import com.fake2edison.mapper.TemplateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by fake2edison on 2019/4/21.
 */
@Service
public class TemplateService {
    @Autowired
    private TemplateMapper templateMapper;

    public int insertTemplate(int uid, Date intime, String title, String summary, String content, int statue,String templateimg){
        int result = templateMapper.insertTemplate(uid,statue,intime,summary,title,content,templateimg);
        return result;
    }
    public List<Template> getTemplateByUser(int id){
        List<Template> templateList = new ArrayList<Template>();
        templateList = templateMapper.selectTemplateByUserId(id);
        return templateList;
    }
    public List<Template> getAllTemplate(){
        List<Template> templateList = new ArrayList<Template>();
        templateList = templateMapper.getAllTemplate();
        return templateList;
    }
    public Template getTemplateById(int id){
        Template template = templateMapper.getTemplateById(id);
        return template;
    }

}