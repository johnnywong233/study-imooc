package com.myimooc.wxdevauth.pcauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myimooc.wxdevauth.pcauth.domain.User;

/**
 * 用户相关资源类
 *
 * @author ZhangCheng on 2017-08-12
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByunionid(String unionid);

}
