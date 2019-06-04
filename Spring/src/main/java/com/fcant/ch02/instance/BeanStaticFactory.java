package com.fcant.ch02.instance;

/**
 * BeanStaticFactory
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 20:17 2019-06-04/0004
 */
public class BeanStaticFactory {
    private static BeanClass beanInstance = new BeanClass("调用静态工厂方法实例化Bean");
    public static BeanClass createInstance() {
        return beanInstance;
    }
}
