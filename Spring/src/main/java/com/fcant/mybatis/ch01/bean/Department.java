package com.fcant.mybatis.ch01.bean;

import com.fcant.ch05_transaction.bean.Tran;
import lombok.Data;

import java.util.List;

/**
 * Department
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 14:36 2019-06-11/0011
 */
@Data
public class Department {
    private int deptId;
    private String deptName;
    private List<Tran> tranList;
}
