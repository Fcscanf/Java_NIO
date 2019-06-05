package com.fcant.ch04_aop.xml.impl;

import com.fcant.ch04_aop.xml.XmlDao;

/**
 * LinkDaoImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 14:48 2019-06-05/0005
 */
public class XmlDaoImpl implements XmlDao {
    @Override
    public void checkBalance() {
        System.out.println("当前余额：1300");
    }
}
