package com.fcant.ch05_transaction.statment.controller;

import com.fcant.ch05_transaction.statment.service.StatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * StatController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 11:10 2019-06-10/0010
 */
@Controller("statController")
public class StatController {

    @Autowired
    private StatService statService;

    public void opStat() {
        String sql = "delete from tran where uid=?";
        String sqlAdd = "insert into tran value(?,?,?)";
        Object[] param = {94, "Frank", "man"};
        statService.delStat(sql, new Object[]{34});
        statService.addStat(sqlAdd, param);
        //statService.addStat(sqlAdd, param);
    }

}
