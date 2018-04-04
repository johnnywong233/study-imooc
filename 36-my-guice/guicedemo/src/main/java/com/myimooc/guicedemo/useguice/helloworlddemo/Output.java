package com.myimooc.guicedemo.useguice.helloworlddemo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.google.inject.BindingAnnotation;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title Output注解
 * @describe
 */
@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
public @interface Output {

}
