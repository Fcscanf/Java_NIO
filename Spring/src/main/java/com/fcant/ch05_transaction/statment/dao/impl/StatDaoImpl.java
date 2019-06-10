package com.fcant.ch05_transaction.statment.dao.impl;

import com.fcant.ch05_transaction.statment.dao.StatDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * StatDaoImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 10:49 2019-06-10/0010
 */
@Repository
public class StatDaoImpl implements StatDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int delStat(String sql, Object[] param) {
        return jdbcTemplate.update(sql, param);
    }

    @Override
    public int addStat(String sql, Object[] param) {
        return jdbcTemplate.update(sql, param);
    }
}
