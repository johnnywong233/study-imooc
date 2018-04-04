package com.myimooc.guicedemo.noguice.helloworlddemo;

import java.io.PrintStream;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title PrintStreamWriter类
 * @describe 实现write()方法
 */
public class PrintStreamWriter implements MyDestination {

    private PrintStream destination;

    public PrintStreamWriter(PrintStream destination) {
        super();
        this.destination = destination;
    }

    @Override
    public void write(String string) {
        destination = System.out;
        destination.println(string);
    }
}
