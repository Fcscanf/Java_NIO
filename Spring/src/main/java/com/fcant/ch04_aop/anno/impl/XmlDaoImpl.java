package com.fcant.ch04_aop.anno.impl;

import com.fcant.ch04_aop.anno.XmlDao;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * LinkDaoImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 14:48 2019-06-05/0005
 */
@Component("xmlDao")
public class XmlDaoImpl implements XmlDao {
    @Override
    public void checkBalance() {
        System.out.println("当前余额：1300");
    }
}
