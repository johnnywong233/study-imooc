package com.myimooc.transactiondemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myimooc.transactiondemo.domain.User;

/**
 * @author zc
 * @version 1.0 2017-09-13
 * @title 用户DAO类
 * @describe 用户相关数据访问类
 */
public interface UserDao extends JpaRepository<User, Long> {

}
