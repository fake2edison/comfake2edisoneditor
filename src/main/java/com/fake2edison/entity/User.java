package com.fake2edison.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class User implements Serializable{
    //用户
    int id;

    String name;
    //姓名

    String telephone;
    //联系电话

    String passwd;
    //密码

    int is_admin;


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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(int is_admin) {
        this.is_admin = is_admin;
    }
}
