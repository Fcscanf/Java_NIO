package com.fcant.ch04_aop;

import com.fcant.ch04_aop.proxy.cglib.Atm;
import com.fcant.ch04_aop.proxy.cglib.AtmInterceptor;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

/**
 * CglibTest
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:56 2019-06-05/0005
 */
public class CglibTest {

    @Test
    public void cglibTest() {
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(Atm.class);
        enhancer.setCallback(new AtmInterceptor());
        Atm atmProxy = (Atm) enhancer.create();
        atmProxy.withDraw(119.9f);
    }

}
