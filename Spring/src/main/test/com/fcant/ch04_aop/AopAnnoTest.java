package com.fcant.ch04_aop;

import com.fcant.ch04_aop.anno.XmlDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * AopAnnoTest
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:17 2019-06-06/0006
 */
public class AopAnnoTest {

    @Test
    public void aopAnnoTest() {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("ch04_aop/anno.xml");
        XmlDao xmlDao = (XmlDao) context.getBean("xmlDao");
        xmlDao.checkBalance();
    }

}
