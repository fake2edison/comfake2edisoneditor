package com.fake2edison.entity;


import java.util.Date;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class Labellist {
    //标题列表
    int id;

    Date intime;
    //插入时间

    String lable_name;
    //表格名称

    int order_num;
    //排序

    int status;
    //权限

    int type;
    //

    Date update_time;
    //日期时间

    public Labellist() {
    }

    public Labellist(int id, Date intime, String lable_name, int order_num, int status, int type, Date update_time) {
        this.id = id;
        this.intime = intime;
        this.lable_name = lable_name;
        this.order_num = order_num;
        this.status = status;
        this.type = type;
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "Labellist{" +
                "id=" + id +
                ", intime=" + intime +
                ", lable_name='" + lable_name + '\'' +
                ", order_num=" + order_num +
                ", status=" + status +
                ", type=" + type +
                ", update_time=" + update_time +
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

    public String getLable_name() {
        return lable_name;
    }

    public void setLable_name(String lable_name) {
        this.lable_name = lable_name;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
