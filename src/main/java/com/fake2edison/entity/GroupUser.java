package com.fake2edison.entity;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class GroupUser {
    //组织用户
    int id;

    int uid;
    //用户id

    int gid;
    //组织id


    @Override
    public String toString() {
        return "GroupUser{" +
                "id=" + id +
                ", uid=" + uid +
                ", gid=" + gid +
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

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public GroupUser() {
    }

    public GroupUser(int id, int uid, int gid) {
        this.id = id;
        this.uid = uid;
        this.gid = gid;
    }
}
