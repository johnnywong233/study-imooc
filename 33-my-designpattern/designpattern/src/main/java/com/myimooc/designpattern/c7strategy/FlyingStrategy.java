package com.myimooc.designpattern.c7strategy;

/**
 * @author zc
 * @version 1.0 2017-08-31
 * @title 策略模式
 * @describe 策略接口，实现鸭子的飞行行为
 */
public interface FlyingStrategy {

    /**
     * 飞行行为的方法
     */
    void performFly();

}
