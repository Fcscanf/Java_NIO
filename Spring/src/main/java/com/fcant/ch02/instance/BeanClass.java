package com.fcant.ch02.instance;

/**
 * BeanClass
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 19:44 2019-06-04/0004
 */
public class BeanClass {
    public String message;
    public BeanClass() {
        message = "构造方法实例化Bean";
    }
    public BeanClass(String s) {
        message = s;
    }

}
