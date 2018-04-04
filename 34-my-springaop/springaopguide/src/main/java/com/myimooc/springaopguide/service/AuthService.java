package com.myimooc.springaopguide.service;

import java.util.Objects;

import org.springframework.stereotype.Service;

import com.myimooc.springaopguide.security.CurrentUserHolder;

/**
 * @author zc
 * @version 1.0 2017-09-03
 * @title 权限校验类
 * @describe 对用户权限进行校验
 */
@Service
public class AuthService {

    public void checkAccess() {
        String user = CurrentUserHolder.get();
        if (!Objects.equals("admin", user)) {
            throw new RuntimeException("operation not allow");
        }
    }

}
