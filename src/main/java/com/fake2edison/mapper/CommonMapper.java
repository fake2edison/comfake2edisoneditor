package com.fake2edison.mapper;

import com.fake2edison.entity.Common;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * Created by fake2edison on 2019/4/12.
 */
public interface CommonMapper {
    public ArrayList<Common> getCommon(@Param("code") String code,@Param("item") int item);
    public ArrayList<Common> getFavoriteByUserId(@Param("uid") int uid,@Param("code") String code,@Param("item") int item);
    public int addFavoritesByUUID(@Param("menu_uuid") String menu_uuid);
    public int removeFavoritesByUUID(@Param("menu_uuid") String menu_uuid);
    public ArrayList<Common> selectCommonByPage(@Param("pre_page") int pre_page,@Param("last_page") int last_page);
    public int addStyleHot(@Param("menu_uuid") String menu_uuid);
    public int countStyle();
    public int addStyle(@Param("menu_uuid") String menu_uuid,@Param("tag_name") String tag_name,@Param("source_editor") String source_editor,@Param("remark") String remark, @Param("name")String name,@Param("content")String content,@Param("type")String type);
}
