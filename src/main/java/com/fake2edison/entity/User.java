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

    int sex;
    //性别

    String passwd;
    //密码

    String img;
    //头像

    Date birth;
    //出生日期

    int favorite_limit;
    //收藏上限

    int photo_limit;
    //图片上限

    int template_limit;
    //模版上限

    int gif_limit;
    //GIF上限

    int apply_limit;
    //导入上限

    int is_admin;
    //是否为管理员


    public int getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(int is_admin) {
        this.is_admin = is_admin;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public int getFavorite_limit() {
        return favorite_limit;
    }

    public void setFavorite_limit(int favorite_limit) {
        this.favorite_limit = favorite_limit;
    }

    public int getPhoto_limit() {
        return photo_limit;
    }

    public void setPhoto_limit(int photo_limit) {
        this.photo_limit = photo_limit;
    }

    public int getTemplate_limit() {
        return template_limit;
    }

    public void setTemplate_limit(int template_limit) {
        this.template_limit = template_limit;
    }

    public int getGif_limit() {
        return gif_limit;
    }

    public void setGif_limit(int gif_limit) {
        this.gif_limit = gif_limit;
    }

    public int getApply_limit() {
        return apply_limit;
    }

    public void setApply_limit(int apply_limit) {
        this.apply_limit = apply_limit;
    }

    public User() {
    }

    public User(int id, String name, String telephone, int sex, String passwd, String img, Date birth, int favorite_limit, int photo_limit, int template_limit, int gif_limit, int apply_limit) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.sex = sex;
        this.passwd = passwd;
        this.img = img;
        this.birth = birth;
        this.favorite_limit = favorite_limit;
        this.photo_limit = photo_limit;
        this.template_limit = template_limit;
        this.gif_limit = gif_limit;
        this.apply_limit = apply_limit;
    }
}
