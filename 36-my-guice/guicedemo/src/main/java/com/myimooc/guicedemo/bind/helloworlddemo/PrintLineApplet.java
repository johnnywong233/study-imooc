package com.myimooc.guicedemo.bind.helloworlddemo;

import com.myimooc.guicedemo.bind.MyApplet;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title PrintLineApplet类
 * @describe 打印当前类名
 */
public class PrintLineApplet implements MyApplet {

    @Override
    public void run() {
        System.out.println("printLineApplet");
    }

}
