package com.myimooc.guicedemo.aop;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title Logged注解
 * @describe 用于标识需要记录日志的方法
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Logged {

}
