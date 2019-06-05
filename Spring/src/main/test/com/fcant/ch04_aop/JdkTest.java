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

    @Test
    public void jdkProxyTest() {
        AtmInvocationHandler handler = new AtmInvocationHandler(new Atm());
        Account proxy = (Account) handler.getProxy();
        proxy.withDraw(123.0f);
    }
}
