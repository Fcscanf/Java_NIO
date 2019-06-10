package com.fcant.mybatis.ch01;

import com.fcant.ch05_transaction.bean.Tran;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

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
    public void mybatisSelectTest() {
        InputStream resourceAsStream = MybatisTest.class.getClassLoader().getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //Tran tran = sqlSession.selectOne("com.fcant.mybatis.ch01.mapper.TranMapper.selectUserById", 90);
        //System.out.println(tran.toString());
        // 命名空间为了识别重名，所以在此处可以使用也可以不使用
        List<Tran> trans = sqlSession.selectList("com.fcant.mybatis.ch01.mapper.TranMapper.selectAllUser");
        for (Tran tran : trans) {
            System.out.println(tran.toString());
        }
    }

    @Test
    public void mybatisAddTest() {
        InputStream resourceAsStream = MybatisTest.class.getClassLoader().getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Tran tran = new Tran();
        tran.setUid(88);
        tran.setUname("Grid");
        tran.setUsex("woman");
        sqlSession.insert("com.fcant.mybatis.ch01.mapper.TranMapper.addUser", tran);
        System.out.println("用户添加成功!");
    }
}
