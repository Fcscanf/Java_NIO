package com.fcant.springmvc.bean;

import lombok.Data;

/**
 * User
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 16:11 2019-06-12/0012
 */
@Data
public class User {
    private String userName;
    private String fullName;
    private String password;
    private Address address;
}
