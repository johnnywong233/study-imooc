package com.myimooc.designpattern.c7strategy;

import com.myimooc.designpattern.c7strategy.impl.FlyWithWin;

/**
 * @author zc
 * @version 1.0 2017-08-31
 * @title 策略模式
 * @describe 红色头的鸭子
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super();
        super.setFlyingStrategy(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }
}
