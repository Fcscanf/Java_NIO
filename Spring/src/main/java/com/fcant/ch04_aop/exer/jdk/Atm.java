package com.fcant.ch04_aop.exer.jdk;

/**
 * Atm
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 11:23 2019-06-05/0005
 */
public class Atm implements UserDao {
    @Override
    public void withDraw(float count) {
        System.out.println("取款金额：" + count);
    }
}
