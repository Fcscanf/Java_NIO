package com.fcant.ch05_transaction.statment.dao;

/**
 * StatDao
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 10:48 2019-06-10/0010
 */
public interface StatDao {

    public int delStat(String sql, Object[] param);

    public int addStat(String sql, Object[] param);
}
