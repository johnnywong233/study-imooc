package com.myimooc.guicedemo.bind.helloworlddemo;

import java.util.Arrays;
import java.util.List;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title CommandLineModule类
 * @describe 封装从命令行传入的参数
 */
public class CommandLineModule extends AbstractModule {

    private final String[] args;

    public CommandLineModule(String[] args) {
        super();
        this.args = args;
    }

    @Override
    protected void configure() {

    }

    @Provides
    @Args
    List<String> getCommandLineArgs() {
        return Arrays.asList(args).subList(1, args.length);
    }

}
