package com.fake2edison.entity;

import java.util.Date;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class Material {
    //素材
    String uuid;

    String author;
    //作者

    String author_account;
    //作者账号

    String author_biz_info;
    //作者编码

    String author_name;
    //作者名字

    String author_wxid;
    //作者微信号

    String descripthion;
    //描述

    String image_url;
    //图片链接

    Date public_time;
    //发布日期

    int status;
    //权限

    String summary;
    //摘要

    String title;
    //文章标题

    String url;
    //文章链接


    @Override
    public String toString() {
        return "Material{" +
                "uuid='" + uuid + '\'' +
                ", author='" + author + '\'' +
                ", author_account='" + author_account + '\'' +
                ", author_biz_info='" + author_biz_info + '\'' +
                ", author_name='" + author_name + '\'' +
                ", author_wxid='" + author_wxid + '\'' +
                ", descripthion='" + descripthion + '\'' +
                ", image_url='" + image_url + '\'' +
                ", public_time=" + public_time +
                ", status=" + status +
                ", summary='" + summary + '\'' +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor_account() {
        return author_account;
    }

    public void setAuthor_account(String author_account) {
        this.author_account = author_account;
    }

    public String getAuthor_biz_info() {
        return author_biz_info;
    }

    public void setAuthor_biz_info(String author_biz_info) {
        this.author_biz_info = author_biz_info;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_wxid() {
        return author_wxid;
    }

    public void setAuthor_wxid(String author_wxid) {
        this.author_wxid = author_wxid;
    }

    public String getDescripthion() {
        return descripthion;
    }

    public void setDescripthion(String descripthion) {
        this.descripthion = descripthion;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Date getPublic_time() {
        return public_time;
    }

    public void setPublic_time(Date public_time) {
        this.public_time = public_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Material() {
    }

    public Material(String uuid, String author, String author_account, String author_biz_info, String author_name, String author_wxid, String descripthion, String image_url, Date public_time, int status, String summary, String title, String url) {
        this.uuid = uuid;
        this.author = author;
        this.author_account = author_account;
        this.author_biz_info = author_biz_info;
        this.author_name = author_name;
        this.author_wxid = author_wxid;
        this.descripthion = descripthion;
        this.image_url = image_url;
        this.public_time = public_time;
        this.status = status;
        this.summary = summary;
        this.title = title;
        this.url = url;
    }
}
