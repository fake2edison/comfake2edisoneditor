package com.fake2edison.entity;

import java.util.Date;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class Common {
    //常用

    String menu_uuid;

    Date update_time;
    //更新时间

    String tag_name;
    //标签名称

    int store_num;
    //收藏数量

    int status;

    String source_editor;

    String remark;
    //备注

    int pass;

    String name;
    //名称

    Date insert_time;
    //载入时间

    String img_url;
    //图片链接

    int height;

    int flag;

    String content;
    //html文本

    String type;

    @Override
    public String toString() {
        return "Common{" +
                "menu_uuid='" + menu_uuid + '\'' +
                ", update_time=" + update_time +
                ", tag_name='" + tag_name + '\'' +
                ", store_num=" + store_num +
                ", status=" + status +
                ", source_editor='" + source_editor + '\'' +
                ", remark='" + remark + '\'' +
                ", pass=" + pass +
                ", name='" + name + '\'' +
                ", insert_time=" + insert_time +
                ", img_url='" + img_url + '\'' +
                ", height=" + height +
                ", flag=" + flag +
                ", content='" + content + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getMenu_uuid() {
        return menu_uuid;
    }

    public void setMenu_uuid(String menu_uuid) {
        this.menu_uuid = menu_uuid;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    public int getStore_num() {
        return store_num;
    }

    public void setStore_num(int store_num) {
        this.store_num = store_num;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSource_editor() {
        return source_editor;
    }

    public void setSource_editor(String source_editor) {
        this.source_editor = source_editor;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(Date insert_time) {
        this.insert_time = insert_time;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Common() {
    }

    public Common(String menu_uuid, Date update_time, String tag_name, int store_num, int status, String source_editor, String remark, int pass, String name, Date insert_time, String img_url, int height, int flag, String content, String type) {
        this.menu_uuid = menu_uuid;
        this.update_time = update_time;
        this.tag_name = tag_name;
        this.store_num = store_num;
        this.status = status;
        this.source_editor = source_editor;
        this.remark = remark;
        this.pass = pass;
        this.name = name;
        this.insert_time = insert_time;
        this.img_url = img_url;
        this.height = height;
        this.flag = flag;
        this.content = content;
        this.type = type;
    }
}
