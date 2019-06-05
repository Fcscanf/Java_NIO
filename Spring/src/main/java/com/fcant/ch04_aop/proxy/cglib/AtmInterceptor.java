package com.fcant.ch04_aop.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * AtmInterceptor
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:48 2019-06-05/0005
 */
public class AtmInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("事务开始");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("事务结束");
        return result;
    }
}
