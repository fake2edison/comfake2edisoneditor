package com.fake2edison.entity;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class Favorites {
    //用户收藏表

    int id;

    int uid;
    //用户id

    String cid;
    //常用id
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }


    public Favorites() {
    }
}
