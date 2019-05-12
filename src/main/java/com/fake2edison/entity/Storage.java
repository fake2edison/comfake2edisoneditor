package com.fake2edison.entity;

import java.util.Date;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class Storage {
    //图库

    int id;

    int uid;
    //用户id

    int status;
    //权限

    String source;

    String photo_name;
    //图片名称

    Date intime;
    //日期时间

    String content;
    //Html文本


    @Override
    public String toString() {
        return "Storage{" +
                "id=" + id +
                ", uid=" + uid +
                ", status=" + status +
                ", source='" + source + '\'' +
                ", photo_name='" + photo_name + '\'' +
                ", intime=" + intime +
                ", content='" + content + '\'' +
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getPhoto_name() {
        return photo_name;
    }

    public void setPhoto_name(String photo_name) {
        this.photo_name = photo_name;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Storage() {
    }

    public Storage(int id, int uid, int status, String source, String photo_name, Date intime, String content) {
        this.id = id;
        this.uid = uid;
        this.status = status;
        this.source = source;
        this.photo_name = photo_name;
        this.intime = intime;
        this.content = content;
    }
}
