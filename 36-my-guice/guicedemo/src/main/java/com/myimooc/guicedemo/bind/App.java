package com.myimooc.guicedemo.bind;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.myimooc.guicedemo.bind.helloworlddemo.CommandLineModule;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title 启动类
 * @describe 4-3 改造HelloWorld类
 */
public class App {
    /**
     * main方法的作用
     * bootstrap:
     * parse command line：解析命令行参数
     * set up environment：配置环境参数
     * kick off main logic：启动程序逻辑
     *
     * @param args
     */
    public static void main(String[] args) {
        Injector injector = Guice
                .createInjector(new MainModule(), new CommandLineModule(args));
        Applets.get(injector, args[0]).run();
    }
}
