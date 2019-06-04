package com.fcant.ch01;

import com.fcant.ch01.dao.TestDao;
import com.fcant.ch02.instance.BeanClass;
import com.fcant.ch02.life.BeanLife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * SpringTest
 *
 * @author Fcscanf
 * @description
 * @date 下午 14:20 2019-06-03/0003
 */
public class SpringTest {

    @Test
    public void testCh01() {
        //初始化Spring容器ApplicationContext，加载配置文件
        ApplicationContext appCon = new ClassPathXmlApplicationContext("ch01/applicationContext.xml");
        //通过容器获取test实例
        TestDao tt = (TestDao)appCon.getBean("test");//test为配置文件中的id
        tt.sayHello();
    }

    @Test
    public void testCh02() {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("ch02/applicationContext.xml");
        BeanClass b1 = (BeanClass)appCon.getBean("constructorInstance");
        System.out.println(b1+ b1.message);
        BeanClass b2 = (BeanClass)appCon.getBean("staticFactoryInstance");
        System.out.println(b2  + b2.message);
        BeanClass b3 = (BeanClass)appCon.getBean("instanceFactoryInstance");
        System.out.println(b3  + b3.message);

        //测试singleton作用域
        //测试构造方法实例化Bean
        BeanClass b4 = (BeanClass)appCon.getBean("constructorInstance");
        System.out.println(b4);
        BeanClass b5 = (BeanClass)appCon.getBean("constructorInstance");
        System.out.println(b5);
    }

    @Test
    public void ch02LifeTest() {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("ch02/applicationContext.xml");
        System.out.println("获得对象前");
        BeanLife blife = (BeanLife)ctx.getBean("beanLife");
        System.out.println("获得对象后" + blife);
        ctx.close();//关闭容器，销毁Bean对象

    }

}
