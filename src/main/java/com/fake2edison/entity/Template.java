package com.fake2edison.entity;

import java.util.Date;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class Template {
    //模版

    int id;

    int uid;
    //用户id

    int statue;

    Date insert_time;
    //载入时间
    String content;
    //html文本
    String summary;

    String title;

    public String getTemplateimg() {
        return templateimg;
    }

    public void setTemplateimg(String templateimg) {
        this.templateimg = templateimg;
    }

    String templateimg;

    @Override
    public String toString() {
        return "Template{" +
                "id=" + id +
                ", uid=" + uid +
                ", statue=" + statue +
                ", insert_time=" + insert_time +
                ", content='" + content + '\'' +
                ", summary='" + summary + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getStatue() {
        return statue;
    }

    public void setStatue(int statue) {
        this.statue = statue;
    }

    public Date getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(Date insert_time) {
        this.insert_time = insert_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Template() {
    }

    public Template(int id, int uid, int statue, Date insert_time, String content, String summary, String title) {
        this.id = id;
        this.uid = uid;
        this.statue = statue;
        this.insert_time = insert_time;
        this.content = content;
        this.summary = summary;
        this.title = title;
    }
}
