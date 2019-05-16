package com.fake2edison.entity;

import java.util.Date;

/**
 * Created by fake2edison on 2018/12/17.
 */
public class Common {
    //常用

    String menu_uuid;

    String tag_name;
    //标签名称


    String source_editor;

    String remark;
    //备注

    String name;
    //名称

    Date insert_time;
    //载入时间

    int height;


    String content;
    //html文本

    String type;

    public String getMenu_uuid() {
        return menu_uuid;
    }

    public void setMenu_uuid(String menu_uuid) {
        this.menu_uuid = menu_uuid;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
}
