package com.fcant.ch04_aop.proxy;

/**
 * Atm
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 10:31 2019-06-05/0005
 */
public class Atm implements Account {


    @Override
    public void withDraw(float count) {
        System.out.println("取款金额：" + count);
    }
}
