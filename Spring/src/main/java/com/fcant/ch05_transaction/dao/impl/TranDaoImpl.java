package com.fcant.ch05_transaction.dao.impl;

import com.fcant.ch05_transaction.bean.Tran;
import com.fcant.ch05_transaction.dao.TranDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TranDaoImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 10:23 2019-06-06/0006
 */
@Repository("tranDao")
public class TranDaoImpl implements TranDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int updateTran(String sql, Object[] args) {
        int i = jdbcTemplate.update(sql, args);
        return i;
    }

    @Override
    public List<Tran> queryTran(String sql, Object[] args) {
        RowMapper<Tran> rowMapper = new BeanPropertyRowMapper<Tran>(Tran.class);
        List<Tran> trans = jdbcTemplate.query(sql, args, rowMapper);
        return trans;
    }
}
