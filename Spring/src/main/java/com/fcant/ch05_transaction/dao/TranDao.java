package com.fcant.ch05_transaction.dao;

import com.fcant.ch05_transaction.bean.Tran;

import java.util.List;

/**
 * TranDao
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 10:21 2019-06-06/0006
 */
public interface TranDao {
    public int updateTran(String sql, Object[] args);

    public List<Tran> queryTran(String sql, Object[] args);

}
