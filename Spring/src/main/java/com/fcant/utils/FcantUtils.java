package com.fcant.utils;

/**
 * FcantUtils
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 15:01 2019-06-06/0006
 */
public class FcantUtils {
    public static String getCurrentMethodName() {
        int level = 1;
        StackTraceElement[] stacks = new Throwable().getStackTrace();
        String methodName = stacks[level].getMethodName();
        return methodName;
    }
}
