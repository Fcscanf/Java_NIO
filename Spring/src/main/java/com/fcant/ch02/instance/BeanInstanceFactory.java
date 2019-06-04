package com.fcant.ch02.instance;

/**
 * BeanInstanceFactory
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 20:21 2019-06-04/0004
 */
public class BeanInstanceFactory {
    public BeanClass createBeanClassInstance() {
        return new BeanClass("调用实例工厂方法实例化Bean");
    }
}
