package com.myimooc.guicedemo.server;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title 付款接口类
 * @describe 模拟订单系统
 */
public interface PaymentService {

    void pay(long orderId, long price, Long sessionId);

}
