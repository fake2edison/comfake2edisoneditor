package com.fake2edison.entity;

import java.util.Date;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class MillionsPhoto {
    //创意配图
    int id;

    Date intime;
    //入库时间

    int order_num;

    int status;
    //权限

    String url;
    //链接

    String content;
    //html文本

    String photo_name;

    @Override
    public String toString() {
        return "MillionsPhoto{" +
                "id=" + id +
                ", intime=" + intime +
                ", order_num=" + order_num +
                ", status=" + status +
                ", url='" + url + '\'' +
                ", content='" + content + '\'' +
                ", photo_name='" + photo_name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public int getOrder_num() {
        return order_num;
    }

    public void setOrder_num(int order_num) {
        this.order_num = order_num;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPhoto_name() {
        return photo_name;
    }

    public void setPhoto_name(String photo_name) {
        this.photo_name = photo_name;
    }

    public MillionsPhoto() {
    }

    public MillionsPhoto(int id, Date intime, int order_num, int status, String url, String content, String photo_name) {
        this.id = id;
        this.intime = intime;
        this.order_num = order_num;
        this.status = status;
        this.url = url;
        this.content = content;
        this.photo_name = photo_name;
    }
}
