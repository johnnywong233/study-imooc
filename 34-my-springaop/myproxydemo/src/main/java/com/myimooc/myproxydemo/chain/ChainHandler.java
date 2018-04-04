package com.myimooc.myproxydemo.chain;

/**
 * @author zc
 * @version 1.0 2017-09-13
 * @title 责任链模式
 * @describe 对Handler进行封装
 */
public abstract class ChainHandler {

    public void execute(Chain chain) {
        handleProcess();
        chain.proceed();
    }

    // 由子类实现
    protected abstract void handleProcess();

}
