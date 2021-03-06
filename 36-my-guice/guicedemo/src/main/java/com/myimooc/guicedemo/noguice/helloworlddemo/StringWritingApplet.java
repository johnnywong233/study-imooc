package com.myimooc.guicedemo.noguice.helloworlddemo;

import com.myimooc.guicedemo.noguice.MyApplet;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title HelloWorldPrinter类
 * @describe 提供打印HelloWorld的功能
 */
public class StringWritingApplet implements MyApplet {

    private MyDestination destination;
    private StringProvider stringProvider;

    public StringWritingApplet(MyDestination destination, StringProvider stringProvider) {
        super();
        this.destination = destination;
        this.stringProvider = stringProvider;
    }

    private void writeString() {
        destination.write(stringProvider.get());
    }

    @Override
    public void run() {
        writeString();
    }
}
