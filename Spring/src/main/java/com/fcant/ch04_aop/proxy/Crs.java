package com.fcant.ch04_aop.proxy;

/**
 * Crs
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 10:37 2019-06-05/0005
 */
public class Crs implements Account {

    private Atm atm = new Atm();

    @Override
    public void withDraw(float count) {
        atm.withDraw(count);
    }

    public void deposit(float count) {
        System.out.println("存入金额：" + count);
    }
}
