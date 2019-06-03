package com.fcant.ch01.dao.impl;

import com.fcant.ch01.dao.TestDao;

/**
 * TestDaoImpl
 *
 * @author Fcscanf
 * @description
 * @date 下午 14:16 2019-06-03/0003
 */
public class TestDaoImpl implements TestDao {
    @Override
    public void sayHello() {
        System.out.println("Fcant, Hello");
    }
}
