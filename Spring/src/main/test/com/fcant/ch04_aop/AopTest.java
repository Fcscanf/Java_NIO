package com.fcant.ch04_aop;

import com.fcant.ch04_aop.aop.LinkDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AopTest
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 14:54 2019-06-05/0005
 */
public class AopTest {
    @Test
    public void aopTest() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("ch04_aop/aop.xml");
        LinkDao proxy = (LinkDao) context.getBean("linkDaoProxy");
        proxy.checkBalance();
    }
}
