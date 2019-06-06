package com.fcant.ch04_aop.exer.cglib;

import com.fcant.utils.FcantUtils;
import com.fcant.utils.LogUtils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Atm
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:46 2019-06-05/0005
 */
public class UserDao {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void withDraw(float count) throws IOException {
        String methodName = FcantUtils.getCurrentMethodName();
        String currentTime = dateFormat.format(new Date());
        LogUtils.writeLog(currentTime, UserDao.class, methodName);
        System.out.println("当前余额：" + count);
    }

    public void checkBalance() throws IOException {
        String methodName = FcantUtils.getCurrentMethodName();
        String currentTime = dateFormat.format(new Date());
        LogUtils.writeLog(currentTime, UserDao.class, methodName);
        System.out.println("余额不足");
    }
}
