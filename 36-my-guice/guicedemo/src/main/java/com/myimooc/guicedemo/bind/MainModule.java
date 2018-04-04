package com.myimooc.guicedemo.bind;

import com.google.inject.AbstractModule;
import com.myimooc.guicedemo.bind.helloworlddemo.HelloWorldModule;
import com.myimooc.guicedemo.bind.helloworlddemo.PrintLineModule;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title MainModule类
 * @describe Guice用来配置的类
 */
public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new HelloWorldModule());
        install(new PrintLineModule());
    }
}
