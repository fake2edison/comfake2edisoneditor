package com.fake2edison.rpc.service;

import com.fake2edison.entity.Common;
import com.fake2edison.entity.User;
import com.fake2edison.mapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by fake2edison on 2019/4/12.
 */
@Service
public class CommonService {
    @Autowired
    private CommonMapper commonMapper;


    public ArrayList<Common> getCommon(String code,int item){
        ArrayList<Common> commonArrayList = new ArrayList<Common>();
        commonArrayList = commonMapper.getCommon(code,item);
        return commonArrayList;
    }

    public ArrayList<Common> getFavoriteByUserId(int uid,String code,int item){
        ArrayList<Common> commonArrayList = new ArrayList<Common>();
        commonArrayList = commonMapper.getFavoriteByUserId(uid,code,item);
        return commonArrayList;
    }

    public int addFavoritesByUUID(String uuid){
        int count = commonMapper.addFavoritesByUUID(uuid);
        return count;
    }

    public int removeFavoritesByUUID(String uuid){
        int count = commonMapper.removeFavoritesByUUID(uuid);
        return count;
    }

    public ArrayList<Common> selectCommonByPage(int pre_page,int last_page){
        ArrayList<Common> commonArrayList = new ArrayList<Common>();
        commonArrayList = commonMapper.selectCommonByPage(pre_page,last_page);
        return commonArrayList;
    }

    public int addStyleHot(String uuid){
        int count = commonMapper.addStyleHot(uuid);
        return count;
    }

    public int countStyle(){
        int count = commonMapper.countStyle();
        return count;
    }

    public int addStyle(String menu_uuid, String tag_name, String source_editor,String remark,String name,String content, String type){
        int count = commonMapper.addStyle(menu_uuid,tag_name,source_editor,remark,name,content,type);
        return count;
    }
}
