package com.fcant.ch02.annotation.dao.impl;

import com.fcant.ch02.annotation.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * UserDaoImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:26 2019-06-05/0005
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("新增一个用户");
    }
}
