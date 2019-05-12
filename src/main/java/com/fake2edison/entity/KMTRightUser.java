package com.fake2edison.entity;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class KMTRightUser {
    //权限用户表
    int id;

    int uid;
    //用户id

    int Rid;
    //权限id


    public KMTRightUser() {
    }

    @Override
    public String toString() {
        return "KMTRightUser{" +
                "id=" + id +
                ", uid=" + uid +
                ", Rid=" + Rid +
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

    public int getRid() {
        return Rid;
    }

    public void setRid(int rid) {
        Rid = rid;
    }

    public KMTRightUser(int id, int uid, int rid) {
        this.id = id;
        this.uid = uid;
        Rid = rid;
    }
}
