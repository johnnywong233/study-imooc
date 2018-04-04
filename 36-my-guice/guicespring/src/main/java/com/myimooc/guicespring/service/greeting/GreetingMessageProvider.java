package com.myimooc.guicespring.service.greeting;

import javax.inject.Inject;

import com.google.inject.Provider;
import com.myimooc.guicespring.dao.SampleDao;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title 业务逻辑类
 * @describe 处理Greeting相关请求，并返回结果
 */
public class GreetingMessageProvider implements Provider<String> {

    private final RequestParams params;
    private final SampleDao dao;

    @Inject
    public GreetingMessageProvider(RequestParams params, SampleDao dao) {
        super();
        this.params = params;
        this.dao = dao;
    }

    @Override
    public String get() {
        String name = params.getGreetingName();
        dao.getPersonData(name);
        return "Hello " + name;
    }

}
