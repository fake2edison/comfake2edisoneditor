package com.fake2edison.entity;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class KMTgroup {
    //组织
    int id;

    String name;
    //名称

    int pid;
    //父节点

    int managerid;
    //管理人员id


    public KMTgroup() {
    }

    @Override
    public String toString() {
        return "KMTgroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pid=" + pid +
                ", managerid=" + managerid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getManagerid() {
        return managerid;
    }

    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }

    public KMTgroup(int id, String name, int pid, int managerid) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.managerid = managerid;
    }
}
