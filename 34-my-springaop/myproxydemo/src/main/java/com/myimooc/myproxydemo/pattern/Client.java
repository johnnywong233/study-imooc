package com.myimooc.myproxydemo.pattern;

/**
 * @author zc
 * @version 1.0 2017-09-13
 * @title 客户端
 * @describe 测试代理模式
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        subject.request();
    }

}
