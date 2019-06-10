package com.fcant.ch05_transaction.statment.service.impl;

import com.fcant.ch05_transaction.statment.dao.StatDao;
import com.fcant.ch05_transaction.statment.service.StatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * StatServiceImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 10:52 2019-06-10/0010
 */
//@Transactional
@Service
public class StatServiceImpl implements StatService {

    @Autowired
    private StatDao statDao;

    @Override
    public int delStat(String sql, Object[] param) {
        return statDao.delStat(sql, param);
    }

    @Override
    public int addStat(String sql, Object[] param) {
        return statDao.addStat(sql, param);
    }
}
