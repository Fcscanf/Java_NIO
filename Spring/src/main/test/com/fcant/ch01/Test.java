package com.fcant.ch01;

import com.fcant.ch01.dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test
 *
 * @author Fcscanf
 * @description
 * @date 下午 14:20 2019-06-03/0003
 */
public class Test {
    public static void main(String[] args) {
        //初始化Spring容器ApplicationContext，加载配置文件
        ApplicationContext appCon = new ClassPathXmlApplicationContext("ch01/applicationContext.xml");
        //通过容器获取test实例
        TestDao tt = (TestDao)appCon.getBean("test");//test为配置文件中的id
        tt.sayHello();
    }

}
