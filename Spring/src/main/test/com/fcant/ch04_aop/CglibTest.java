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

    /**
     * CGLIB字节码生成库
     * 1、不需要目标对象实现指定接口
     * 2、被final修饰的类和方法是不能用CGLIB实现代理
     *
     * @author Fcscanf
     * @date 下午 14:18 2019-06-05/0005
     */

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
