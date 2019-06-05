package com.fcant.ch04_aop;

import com.fcant.ch04_aop.proxy.jdk.Account;
import com.fcant.ch04_aop.proxy.jdk.Atm;
import com.fcant.ch04_aop.proxy.jdk.AtmInvocationHandler;
import org.junit.Test;

/**
 * JdkTest
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 11:36 2019-06-05/0005
 */
public class JdkTest {

    /**
     * JDK动态代理的不足
     * 1、目标对象和代理对象需要实现同一个接口
     * 2、接口中的所有方法都被添加了相同的代理逻辑，不灵活
     *
     * @author Fcscanf
     * @date 下午 14:16 2019-06-05/0005
     */

    @Test
    public void jdkProxyTest() {
        AtmInvocationHandler handler = new AtmInvocationHandler(new Atm());
        Account proxy = (Account) handler.getProxy();
        proxy.withDraw(123.0f);
    }
}
