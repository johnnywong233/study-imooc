package com.myimooc.guicedemo.server.impl;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.myimooc.guicedemo.server.OrderService;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title 测试类
 * @describe 模拟订单系统
 */
public class OrderServiceTest {

    @Inject
    private OrderService orderService;

    @Before
    public void setUp() {
        Guice.createInjector(new ServerModule())
                .injectMembers(this);
    }

    @Test
    public void TestSendToPayment() {
        orderService.sendToPayment(789L);
    }
}
