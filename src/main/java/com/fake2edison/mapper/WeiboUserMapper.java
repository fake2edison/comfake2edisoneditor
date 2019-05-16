package com.fake2edison.mapper;

import com.fake2edison.entity.WeiboUser;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * Created by fake2edison on 2019/4/12.
 */
public interface WeiboUserMapper {

    public int insertWeiboUser(@Param("uid") int uid, @Param("wid") String wid);

    public ArrayList<String> getWidByUid(@Param("uid") int uid);

    public ArrayList<WeiboUser> isExitUid(@Param("wid")String wid);

    public int delWeiboUserByUid(@Param("wid") String wid);
}
