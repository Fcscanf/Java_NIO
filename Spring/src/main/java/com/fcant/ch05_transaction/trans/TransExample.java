package com.fcant.ch05_transaction.trans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

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

    @Autowired
    private TransactionTemplate transactionTemplate;

    String msg = "";

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

    public String transTemTest() {

        transactionTemplate.execute(new TransactionCallback<Object>() {
            @Override
            public Object doInTransaction(TransactionStatus transactionStatus) {
                String sql = "delete from tran where uid=34";
                String sqlAdd = "insert into tran value(?,?,?)";
                Object[] param = {93, "jeer", "man"};
                try {
                    jdbcTemplate.update(sql);
                    jdbcTemplate.update(sqlAdd, param);
                    //jdbcTemplate.update(sqlAdd, param);
                    msg = "E02:事务提交成功";
                } catch (Exception e) {
                    msg = "E02:主键重复，事务回滚";
                    e.printStackTrace();
                }
                return msg;
            }
        });
        return msg;
    }

}
