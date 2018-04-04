package com.myimooc.guicedemo.server.impl;

import javax.inject.Inject;

import com.google.inject.Provider;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title session管理类
 * @describe 模拟订单系统
 */
public class SessionManager {

    private final Provider<Long> sessionIdProvider;

    @Inject
    public SessionManager(@SessionId Provider<Long> sessionIdProvider) {
        super();
        this.sessionIdProvider = sessionIdProvider;
    }

    public Long getSessionId() {
        return sessionIdProvider.get();
    }

}
