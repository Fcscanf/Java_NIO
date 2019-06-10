package com.fcant.mybatis.ch01;

import com.fcant.ch05_transaction.bean.Tran;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

/**
 * MybatisTest
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 15:04 2019-06-10/0010
 */
public class MybatisTest {

    @Test
    public void mybatisTest() {
        InputStream resourceAsStream = MybatisTest.class.getClassLoader().getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Tran tran = sqlSession.selectOne("com.fcant.mybatis.ch01.mapper.TranMapper.selectUserById", 90);
        System.out.println(tran.toString());
    }
}
