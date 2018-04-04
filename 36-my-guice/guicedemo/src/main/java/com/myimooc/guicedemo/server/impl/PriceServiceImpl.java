package com.myimooc.guicedemo.server.impl;

import com.myimooc.guicedemo.server.PriceService;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title 价格业务实现类
 * @describe 模拟订单系统
 */
public class PriceServiceImpl implements PriceService {

    @Override
    public long getPrice(long orderId) {
        return 456L;
    }

}
