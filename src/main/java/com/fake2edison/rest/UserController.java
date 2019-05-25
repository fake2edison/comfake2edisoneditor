package com.fake2edison.rest;

import com.fake2edison.entity.Common;
import com.fake2edison.entity.User;
import com.fake2edison.rpc.service.LogService;
import com.fake2edison.rpc.service.TemplateService;
import com.fake2edison.rpc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by fake2edison on 2019/4/13.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private TemplateService templateService;
    @Autowired
    private LogService logService;

    /**
     *  用于用户注册
     * @param account
     * @param telephone
     * @param password
     * @return
     */
    @RequestMapping(value = "/regiest",method = RequestMethod.GET)
    @ResponseBody
    public String regiestUser(@RequestParam("account") String account,@RequestParam("telephone") String telephone, @RequestParam("password") String password){
        //获得电话 判断是否已经注册
        boolean flag = userService.userIsRegiest(telephone);
        String result = "已注册";
        if(!flag){
            result = userService.userRegiest(account,telephone,password);
        }
        return result;
    }

    /**
     * 用于用户登陆
     * @param request
     * @param account
     * @param password
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public User loginUser(HttpServletRequest request, @RequestParam("account") String account, @RequestParam("password") String password){
        User user = userService.userLogin(account,password);
        if(user!=null){
            request.getSession().setAttribute("USER",user);
        }
        return user;
    }

    @RequestMapping(value = "/isLogin",method = RequestMethod.GET)
    @ResponseBody
    public User isLoginUser(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        return user;
    }

    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    @ResponseBody
    public String Logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("USER",null);
        return "LOGOUT";
    }

    @RequestMapping(value = "/selectUseByPage",method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<User> selectUserByPage(HttpServletRequest request, @RequestParam("pre_page")int pre_page, @RequestParam("last_page")int last_page){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        ArrayList<User> arrayList = new ArrayList<User>();
        if(user != null && user.getIs_admin() == 1){
            arrayList = userService.selectUserByPage(pre_page,last_page);
        }
        return arrayList;
    }

    @RequestMapping(value = "/addAdminByUid",method = RequestMethod.POST)
    @ResponseBody
    public String addAdminByUid(HttpServletRequest request,@RequestParam("uid") int uid){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        int result = 0;
        if(user!=null && user.getIs_admin() == 1){
            result = userService.addAdminByUid(uid);
        }
        String operation = "添加"+uid+"为管理员";
        if(result == 1){
            logService.insertLog(user.getId(),operation,"成功");
            return "添加成功";
        }else {
            logService.insertLog(user.getId(),operation,"失败");
            return "添加失败";
        }
    }

    @RequestMapping(value = "/removeAdminByUid",method = RequestMethod.POST)
    @ResponseBody
    public String removeAdminByUid(HttpServletRequest request,@RequestParam("uid") int uid){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("USER");
        int result = 0;
        if(user!=null && user.getIs_admin() == 1){
            result = userService.removeAdminByUid(uid);
        }
        String operation = "移除"+uid+"管理员";
        if(result == 1){
            logService.insertLog(user.getId(),operation,"成功");
            return "移除成功";
        }else {
            logService.insertLog(user.getId(),operation,"成功");
            return "移除失败";
        }
    }

    @RequestMapping(value = "/countUser",method = RequestMethod.GET)
    @ResponseBody
    public int countUser(){
        int count = userService.countUser();
        return count;
    }
}
