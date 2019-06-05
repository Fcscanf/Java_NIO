package com.fcant.ch04_aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * XmlAspect
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 15:48 2019-06-05/0005
 */
public class XmlAspect {

    public void before(JoinPoint joinPoint) {
        System.out.println("目标对象：" + joinPoint.getTarget() +
                "被拦截后的方法：" + joinPoint.getSignature().getName());
        System.out.println("-->事前拦截");
    }

    public void afterReturn(JoinPoint joinPoint) {
        System.out.println("被拦截的方法：" + joinPoint.getSignature().getName());
        System.out.println("-->事后拦截");
    }

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕拦截开始");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕拦截结束");
        return proceed;
    }

    public void except(Throwable throwable) {
        System.out.println("异常信息：" + throwable.getMessage());
    }

    public void after() {
        System.out.println("释放资源");
    }
}
