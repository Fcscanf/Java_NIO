package com.fcant.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

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
