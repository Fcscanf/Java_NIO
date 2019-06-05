package com.fcant.ch02.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * User
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:10 2019-06-05/0005
 */
@Component("user")
public class User {
    @Value("Tom")
    private String userName;

    public String showUserName() {
        return userName;
    }
}
