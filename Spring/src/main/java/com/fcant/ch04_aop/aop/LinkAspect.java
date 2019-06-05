package com.fcant.ch04_aop.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * LinkAspect
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 14:38 2019-06-05/0005
 */
public class LinkAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("事务开始");
        // 让目标对象执行方法
        Object proceed = methodInvocation.proceed();
        System.out.println("事务结束");
        return proceed;
    }
}
