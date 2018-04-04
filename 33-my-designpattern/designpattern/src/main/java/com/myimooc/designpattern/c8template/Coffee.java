package com.myimooc.designpattern.c8template;

/**
 * @author zc
 * @version 1.0 2017-09-02
 * @title 模版模式
 * @describe 具体子类，提供了咖啡之中的具体实现
 */
public class Coffee extends RefreshBeverage {

    @Override
    protected void addCondiments() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    protected void brew() {
        System.out.println("加入糖和牛奶");
    }
}
