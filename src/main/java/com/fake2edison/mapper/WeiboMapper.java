package com.fake2edison.mapper;

import com.fake2edison.entity.Weibo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by fake2edison on 2019/4/12.
 */
public interface WeiboMapper {
    public int insertWeibo(@Param("uid") String uid, @Param("name") String name, @Param("accesstoken") String accesstoken);
    public Weibo selectWeiboByWid(@Param("wid")String wid);
    public Weibo selectWeiboByWidAll(@Param("wid") String wid);
}
