package com.fcant.ch02.annotation.controller;

import com.fcant.ch02.annotation.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * UserController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:37 2019-06-05/0005
 */
@Controller("userController")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    public void addUser() {
        userService.addUser();
    }
}
