package com.fake2edison.entity;

import java.util.Date;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class Log {
    //日志
    int id;

    int uid;
    //用户id

    String operation;
    //操作

    String result;
    //结果

    Date time;
    //日期


    public Log() {
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", uid=" + uid +
                ", operation='" + operation + '\'' +
                ", result='" + result + '\'' +
                ", time=" + time +
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

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Log(int id, int uid, String operation, String result, Date time) {
        this.id = id;
        this.uid = uid;
        this.operation = operation;
        this.result = result;
        this.time = time;
    }
}
