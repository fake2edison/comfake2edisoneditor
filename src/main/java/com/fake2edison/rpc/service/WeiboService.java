package com.fake2edison.rpc.service;

import com.fake2edison.entity.Weibo;
import com.fake2edison.mapper.WeiboMapper;
import com.fake2edison.mapper.WeiboUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by fake2edison on 2019/5/11.
 */
@Service
public class WeiboService {
    @Autowired
    private WeiboMapper weiboMapper;

    public int insertWeibo(String uid, String name, String accesstoken){
        int count = weiboMapper.insertWeibo(uid,name,accesstoken);
        return count;
    }

    public Weibo selectWeiboByWid(String wid){
        Weibo weibo = weiboMapper.selectWeiboByWid(wid);
        return weibo;
    }

    public Weibo selectWeiboByWidAll(String wid){
        Weibo weibo = weiboMapper.selectWeiboByWidAll(wid);
        return weibo;
    }
    public int delWeiboByUid(String uid){
        int count = delWeiboByUid(uid);
        return count;
    }
}
