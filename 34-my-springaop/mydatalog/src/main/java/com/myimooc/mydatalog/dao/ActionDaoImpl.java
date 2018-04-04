package com.myimooc.mydatalog.dao;

import org.springframework.stereotype.Service;

import com.myimooc.mydatalog.domain.Action;

/**
 * @author zc
 * @version 1.0 2017-09-13
 * @title 操作记录DAO类实现类
 * @describe 操作记录相关数据访问
 */
@Service
public class ActionDaoImpl implements ActionDao {

    @Override
    public void save(Action action) {
        System.out.println("模拟保存操作，保存成功");
        System.out.println("操作日志：" + action.toString());
    }

}
