package com.fcant.ch05_transaction.trans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * TransExample
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:09 2019-06-10/0010
 */
@Repository("transExample")
public class TransExample {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;

    public String test() {
        TransactionDefinition definition = new DefaultTransactionDefinition();
        TransactionStatus transactionStatus = dataSourceTransactionManager.getTransaction(definition);
        String msg = "事务执行成功！";
        try {
            String sql = "delete from tran where uid=32";
            String sqlAdd = "insert into tran value(?,?,?)";
            Object[] param = {99, "jack", "man"};
            jdbcTemplate.update(sql);
            jdbcTemplate.update(sqlAdd, param);
            //jdbcTemplate.update(sqlAdd, param);
            // 事务提交
            dataSourceTransactionManager.commit(transactionStatus);
        } catch (Exception e) {
            // 事务回滚
            dataSourceTransactionManager.rollback(transactionStatus);
            e.printStackTrace();
            msg = "主键重复，事务回滚";
        }
        return msg;
    }

}
