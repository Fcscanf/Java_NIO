package com.fcant.ch05_transaction;

import com.fcant.ch05_transaction.bean.Tran;
import com.fcant.ch05_transaction.dao.TranDao;
import com.fcant.ch05_transaction.trans.TransExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

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

    /**
     * 测试Spring的查询
     *
     * @author Fcscanf
     * @date 上午 11:26 2019-06-06/0006
     */
    @Test
    public void tranQueryTest() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ch05_transaction/applicationContext.xml");
        String sql = "select * from tran";
        TranDao tranDao = (TranDao) context.getBean("tranDao");
        List<Tran> trans = tranDao.queryTran(sql, null);
        for (Tran tran : trans) {
            System.out.println(tran.toString());
        }
    }

    @Test
    public void tranTest() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ch05_transaction/applicationContext.xml");
        String sql = "insert into tran values(?, ?, ?)";
        Object[] feilds = {null, "Fcant", "male"};
        TranDao tranDao = (TranDao) context.getBean("tranDao");
        tranDao.updateTran(sql, feilds);
    }

    @Test
    public void tranManTest() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ch05_transaction/applicationContext.xml");
        TransExample transExample = (TransExample) context.getBean("transExample");
        System.out.println(transExample.test());
    }

    @Test
    public void tranTemManTest() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ch05_transaction/applicationContext.xml");
        TransExample transExample = (TransExample) context.getBean("transExample");
        System.out.println(transExample.transTemTest());
    }
}
