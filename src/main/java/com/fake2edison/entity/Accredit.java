package com.fake2edison.entity;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class Accredit {
    int id;

    int uid;
    //用户id

    int mid;
    //素材id

    public Accredit(int id, int uid, int mid) {
        this.id = id;
        this.uid = uid;
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Accredit{" +
                "id=" + id +
                ", uid=" + uid +
                ", mid=" + mid +
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

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public Accredit() {
    }
}
