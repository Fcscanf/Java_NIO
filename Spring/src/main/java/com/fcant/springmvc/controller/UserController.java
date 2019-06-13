package com.fcant.springmvc.controller;

import com.fcant.springmvc.bean.User;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

/**
 * UserController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:51 2019-06-12/0012
 */
@RequestMapping(value = "/user")
@Controller
public class UserController {

    private static ArrayList<User> userList;

    {
        userList = new ArrayList<User>();
    }

    @RequestMapping("/showcheckbox")
    public String showCheckBox() {
        return "checkbox";
    }

    @RequestMapping("/array")
    public String getArray(@RequestParam(value = "device") Integer[] device) {
        for (int i = 0; i < device.length; i++) {
            System.out.println(device[i]);
        }
        return "login";
    }

    @RequestMapping("/index")
    public String show() {
        return "index";
    }

    @RequestMapping("/showReg")
    public String showReg() {
        return "reg";
    }

    /**
     * 路径取值
     *
     * @param userid
     * @return wel
     * @author Fcscanf
     * @date 上午 9:21 2019-06-13/0013
     */
    @RequestMapping(value = "/login/{userId}")
    public String login(@PathVariable(value = "userId") String userid) {
        System.out.println(userid);
        return "wel";
    }

    @RequestMapping("/addUser1")
    public String addUser(User user) {
        userList.add(user);
        System.out.println(user.toString());
        return "login";
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestParam("userName") String userName,
                          @RequestParam("fullName") String fullName,
                          @RequestParam("password") String password) {
        User user = new User();
        user.setUserName(userName);
        user.setFullName(fullName);
        user.setPassword(password);
        // 忽略重名用户
        if (isUser(userName)) {
            return "reg";
        } else {
            userList.add(user);
        }

        System.out.println(user.toString());
        return "login";
    }

    @RequestMapping("/loginUser")
    public String loginUser(@RequestParam("userName") String userName,
                            @RequestParam("fullName") String fullName,
                            @RequestParam("password") String password) {
        for (User user : userList) {
            if (user.getUserName().equals(userName)) {
                if (user.getPassword().equals(password)) {
                    return "wel";
                }
            }
        }
        return "reg";
    }

    /**
     * 检查用户名是否已存在
     *
     * @param userName
     * @return true
     * @author Fcscanf
     * @date 下午 19:55 2019-06-12/0012
     */
    public boolean isUser(String userName) {
        for (User user : userList) {
            if (user.getUserName().equals(userName)) {
                return true;
            }
        }
        return false;
    }
}
