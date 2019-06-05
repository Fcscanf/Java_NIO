package com.fcant.ch02.annotation.service.impl;

import com.fcant.ch02.annotation.dao.UserDao;
import com.fcant.ch02.annotation.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserServiceImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:28 2019-06-05/0005
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    UserDao userDao;

    @Override
    public void addUser() {
        userDao.addUser();
    }
}
