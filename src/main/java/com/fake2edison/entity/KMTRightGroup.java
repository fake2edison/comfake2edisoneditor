package com.fake2edison.entity;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class KMTRightGroup {
    //权限组织表
    int id;

    int gid;
    //组织id

    int Rid;
    //权限id


    public KMTRightGroup() {
    }

    public KMTRightGroup(int id, int gid, int rid) {
        this.id = id;
        this.gid = gid;
        Rid = rid;
    }

    @Override
    public String toString() {
        return "KMTRightGroup{" +
                "id=" + id +
                ", gid=" + gid +
                ", Rid=" + Rid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getRid() {
        return Rid;
    }

    public void setRid(int rid) {
        Rid = rid;
    }
}
