package com.fcant.ch04_aop.proxy.cglib;

/**
 * Atm
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:46 2019-06-05/0005
 */
public class Atm {
    public void withDraw(float count) {
        System.out.println("当前余额：" + count);
    }

    public void checkBalance() {
        System.out.println("余额不足");
    }
}
