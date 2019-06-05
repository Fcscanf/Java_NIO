package com.fcant.ch04_aop;

import com.fcant.ch04_aop.proxy.Account;
import com.fcant.ch04_aop.proxy.Crs;
import org.junit.Test;

/**
 * AccountTest
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 10:39 2019-06-05/0005
 */
public class AccountTest {
    @Test
    public void proxyTest() {
        Account account = new Crs();
        account.withDraw(119.5f);
    }
}
