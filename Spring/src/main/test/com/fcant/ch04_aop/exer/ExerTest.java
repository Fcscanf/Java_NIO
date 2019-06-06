package com.fcant.ch04_aop.exer;

import com.fcant.ch04_aop.exer.cglib.UserDao;
import com.fcant.ch04_aop.exer.cglib.UserDaoInterceptor;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

import java.io.IOException;

/**
 * ExerTest
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 14:51 2019-06-06/0006
 */
public class ExerTest {

    @Test
    public void cglibTest() throws IOException {
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(UserDao.class);
        enhancer.setCallback(new UserDaoInterceptor());
        UserDao userDaoProxy = (UserDao) enhancer.create();
        userDaoProxy.withDraw(119.9f);
    }
}
