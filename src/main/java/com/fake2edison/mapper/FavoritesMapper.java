package com.fake2edison.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * Created by fake2edison on 2019/4/12.
 */
public interface FavoritesMapper {
    public ArrayList<String> getFavoritesByUser(@Param("uid") Integer uid);
    public Integer addFavoritesByUser(@Param("uid") Integer uid, @Param("cid") String cid);
    public Integer delFavoritesByUser(@Param("uid") Integer uid, @Param("cid") String cid);
}
