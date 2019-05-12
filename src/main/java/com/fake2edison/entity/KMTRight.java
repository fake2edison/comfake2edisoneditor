package com.fake2edison.entity;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class KMTRight {
    //权限表

    int Rid;

    int Rpid;
    //权限父id

    int RIT;
    //权限名称

    String Rdescription;
    //权限描述


    @Override
    public String toString() {
        return "KMTRight{" +
                "Rid=" + Rid +
                ", Rpid=" + Rpid +
                ", RIT=" + RIT +
                ", Rdescription='" + Rdescription + '\'' +
                '}';
    }

    public int getRid() {
        return Rid;
    }

    public void setRid(int rid) {
        Rid = rid;
    }

    public int getRpid() {
        return Rpid;
    }

    public void setRpid(int rpid) {
        Rpid = rpid;
    }

    public int getRIT() {
        return RIT;
    }

    public void setRIT(int RIT) {
        this.RIT = RIT;
    }

    public String getRdescription() {
        return Rdescription;
    }

    public void setRdescription(String rdescription) {
        Rdescription = rdescription;
    }

    public KMTRight() {
    }

    public KMTRight(int rid, int rpid, int RIT, String rdescription) {
        Rid = rid;
        Rpid = rpid;
        this.RIT = RIT;
        Rdescription = rdescription;
    }
}
