package com.fcant.ch02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TestDI
 *
 * @author Fcscanf
 * @description
 * @date 下午 16:29 2019-06-03/0003
 */
public class TestDI {
    public static void main(String[] args) {
        //初始化Spring容器ApplicationContext，加载配置文件
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取testDIService实例，测试构造方法注入
//        TestDIService ts = (TestDIService)appCon.getBean("testDIService");
//        ts.sayHello();
    }

}
