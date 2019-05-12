package com.fake2edison.rpc.service;

import com.fake2edison.mapper.WeiboUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by fake2edison on 2019/5/11.
 */
@Service
public class WeiboUserService {
    @Autowired
    private WeiboUserMapper weiboUserMapper;

    public int insertWeiboUser(int uid, String wid){
        int count = weiboUserMapper.insertWeiboUser(uid,wid);
        return count;
    }

    public ArrayList<String> getWidByUid(int uid){
        ArrayList<String> widList = weiboUserMapper.getWidByUid(uid);
        return widList;
    }
}
