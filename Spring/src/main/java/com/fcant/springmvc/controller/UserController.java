package com.fcant.springmvc.controller;

import com.fcant.springmvc.bean.User;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("/index")
    public String show() {
        return "index";
    }

    @RequestMapping("/showReg")
    public String showReg() {
        return "reg";
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestParam("userName") String userName,
                          @RequestParam("fullName") String fullName,
                          @RequestParam("password") String password) {
        User user = new User();
        user.setUserName(userName);
        user.setFullName(fullName);
        user.setPassword(password);
        userList.add(user);
        System.out.println(user.toString());
        return "login";
    }
}
