package com.myimooc.guicedemo.bind.helloworlddemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.google.inject.BindingAnnotation;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title Args注解
 * @describe 绑定参数
 */
@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
public @interface Args {

}
