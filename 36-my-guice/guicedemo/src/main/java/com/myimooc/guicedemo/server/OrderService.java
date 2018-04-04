package com.myimooc.guicedemo.server;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title 订单业务接口类
 * @describe 模拟订单系统
 */
public interface OrderService {

    void sendToPayment(long orderId);

}
