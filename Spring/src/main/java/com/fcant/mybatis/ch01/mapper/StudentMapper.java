package com.fcant.mybatis.ch01.mapper;

import com.fcant.mybatis.ch01.bean.Student;
import com.fcant.mybatis.ch01.bean.StudentExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    long countByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    int deleteByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer suid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    List<Student> selectByExample(StudentExample example);

    List<Student> selectStudent(int suid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    Student selectByPrimaryKey(Integer suid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_student
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    int updateByPrimaryKey(Student record);
}