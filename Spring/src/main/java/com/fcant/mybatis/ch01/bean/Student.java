package com.fcant.mybatis.ch01.bean;

public class Student {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.suid
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    private Integer suid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.suname
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    private String suname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_student.suage
     *
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    private String suage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.suid
     *
     * @return the value of t_student.suid
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    public Integer getSuid() {
        return suid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.suid
     *
     * @param suid the value for t_student.suid
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.suname
     *
     * @return the value of t_student.suname
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    public String getSuname() {
        return suname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.suname
     *
     * @param suname the value for t_student.suname
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    public void setSuname(String suname) {
        this.suname = suname == null ? null : suname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_student.suage
     *
     * @return the value of t_student.suage
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    public String getSuage() {
        return suage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_student.suage
     *
     * @param suage the value for t_student.suage
     * @mbg.generated Mon Jun 10 18:48:24 GMT+08:00 2019
     */
    public void setSuage(String suage) {
        this.suage = suage == null ? null : suage.trim();
    }
}