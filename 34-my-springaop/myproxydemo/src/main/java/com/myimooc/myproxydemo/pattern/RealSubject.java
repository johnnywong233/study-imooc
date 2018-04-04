package com.myimooc.myproxydemo.pattern;

/**
 * @author zc
 * @version 1.0 2017-09-13
 * @title 目标对象
 * @describe 实现了Subject接口
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("real subject execute request");
    }

}
