package com.fake2edison.rest;

import com.fake2edison.entity.User;
import com.fake2edison.rpc.service.CommonService;
import com.fake2edison.rpc.service.FavoriteService;
import com.fake2edison.rpc.service.TemplateService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by fake2edison on 2019/4/25.
 */
@Controller
@RequestMapping(value = "/favorites")
public class FavoritesController {
    @Autowired
    private FavoriteService favoriteService;
    @Autowired
    private CommonService commonService;
    @Autowired
    private TemplateService templateService;

    @RequestMapping(value = "/getFavorites",method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<String> getMateri(HttpServletRequest request){
        ArrayList<String> favoriteList= new ArrayList<String>();
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        if(user != null){
            favoriteList = favoriteService.getFavoriteByUser(user.getId());
        }
        return favoriteList;
    }

    @RequestMapping(value = "/addFavorites",method = RequestMethod.POST)
    @ResponseBody
    public int addFavorites(HttpServletRequest request,@Param("uuid") String uuid,@Param("type") int type){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        int result = 0;
        int count = 0;
        if(user != null){
            result = favoriteService.addFavorites(user.getId(),uuid,type);
            if(type == 0){
                count = commonService.addFavoritesByUUID(uuid);
            }else {
                count = templateService.addFavoritesByID(uuid);
            }
        }
        return result;
    }

    @RequestMapping(value = "delFavorites",method = RequestMethod.POST)
    @ResponseBody
    public int delFavorites(HttpServletRequest request,@Param("uuid") String uuid,@Param("type") int type){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        int result = 0;
        int count = 0;
        if(user!=null){
            result = favoriteService.delFavorites(user.getId(),uuid);
            if(type == 0){
                count = commonService.removeFavoritesByUUID(uuid);
            }else {
                count = templateService.delFavoritesByID(uuid);
            }

        }
        return result;
    }
}
