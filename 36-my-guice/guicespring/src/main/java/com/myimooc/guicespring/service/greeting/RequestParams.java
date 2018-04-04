package com.myimooc.guicespring.service.greeting;

import com.google.inject.servlet.RequestScoped;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title POJO类
 * @describe 封装message信息
 */
@RequestScoped
public class RequestParams {

    private String greetingName;

    public String getGreetingName() {
        return greetingName;
    }

    public void setGreetingName(String greetingName) {
        this.greetingName = greetingName;
    }
}
