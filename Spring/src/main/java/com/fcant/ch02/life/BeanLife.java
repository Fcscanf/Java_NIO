package com.fcant.ch02.life;

/**
 * BeanLife
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 20:34 2019-06-04/0004
 */
public class BeanLife {
    public void initMyself() {
        System.out.println(this.getClass().getName() + "执行自定义的初始化方法");
    }
    public void destroyMyself() {
        System.out.println(this.getClass().getName() +"执行自定义的销毁方法");
    }

}
