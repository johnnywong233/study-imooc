package com.myimooc.guicedemo.bind.helloworlddemo;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.myimooc.guicedemo.bind.MyApplet;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title HelloWorldPrinter类
 * @describe 提供打印HelloWorld的功能
 */
public class StringWritingApplet implements MyApplet {

    private MyDestination destination;
    private Provider<String> stringProvider;

    @Inject
    public StringWritingApplet(MyDestination destination, @Output Provider<String> stringProvider) {
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
