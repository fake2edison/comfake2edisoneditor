package com.fake2edison.rpc.service;

import com.fake2edison.mapper.FavoritesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by fake2edison on 2019/4/25.
 */
@Service
public class FavoriteService {
    @Autowired
    private FavoritesMapper favoritesMapper;


    public ArrayList<String> getFavoriteByUser(int uid){
        ArrayList<String> favoriteList = new ArrayList<String>();
        favoriteList = favoritesMapper.getFavoritesByUser(uid);
        return favoriteList;
    }

    public int addFavorites(int uid, String cid,int type){
        int result = favoritesMapper.addFavoritesByUser(uid,cid,type);
        return result;
    }

    public int delFavorites(int uid, String cid){
        int result = favoritesMapper.delFavoritesByUser(uid,cid);
        return result;
    }

    public int delTemplateById(String cid){
        int result = favoritesMapper.delTemplateById(cid);
        return result;
    }

}
