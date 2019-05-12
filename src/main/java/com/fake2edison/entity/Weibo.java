package com.fake2edison.entity;

import java.util.Date;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class Weibo {
    //微博管理
    int id;

    String uid;
    //微博UID

    String name;
    //微博名称

    String accesstoken;
    //授权码

    Date tokendate;
    //授权日期


    public Weibo() {
    }

    public Weibo(int id, String uid, String name, String accesstoken, Date tokendate) {
        this.id = id;
        this.uid = uid;
        this.name = name;
        this.accesstoken = accesstoken;
        this.tokendate = tokendate;
    }

    @Override
    public String toString() {
        return "Weibo{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", accesstoken='" + accesstoken + '\'' +
                ", tokendate=" + tokendate +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccesstoken() {
        return accesstoken;
    }

    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken;
    }

    public Date getTokendate() {
        return tokendate;
    }

    public void setTokendate(Date tokendate) {
        this.tokendate = tokendate;
    }
}
