package com.fcant.utils;

import java.io.*;

/**
 * Log
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 13:46 2019-06-06/0006
 */
public class LogUtils {

    /**
     * 时间戳-类名-方法名保存日志
     * TODO:日志内容会被覆盖，不能追加
     *
     * @param date
     * @param o
     * @param methodName
     * @return
     * @author Fcscanf
     * @date 下午 16:17 2019-06-06/0006
     */
    public static void writeLog(String date, Class o, String methodName) throws IOException {
        String path = "D:\\fcofficework\\Dome\\Idea\\fcsca\\Pro_Learn\\Java_NIO\\Spring\\src\\main\\java\\com\\fcant\\ch04_aop\\exer\\Log.txt";
        File file = new File(path);
        String log = "[" + date + "]:" + "--->>" + o.getName() + "--->>" + methodName;
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        PrintStream ps = new PrintStream(fileOutputStream);
        if (!file.exists()) {
            file.createNewFile();
            ps.append(log);
        } else {
            ps.append(log);
        }
        fileOutputStream.close();
    }
}
