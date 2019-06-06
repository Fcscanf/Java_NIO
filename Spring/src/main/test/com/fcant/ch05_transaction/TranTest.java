package com.fcant.ch05_transaction;

import com.fcant.ch05_transaction.dao.TranDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TranTest
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 10:30 2019-06-06/0006
 */
public class TranTest {

    @Test
    public void tranTest() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ch05_transaction/applicationContext.xml");
        String sql = "insert into tran values(?, ?, ?)";
        Object[] feilds = {null, "Fcant", "male"};
        TranDao tranDao = (TranDao) context.getBean("tranDao");
        tranDao.updateTran(sql, feilds);
    }
}
