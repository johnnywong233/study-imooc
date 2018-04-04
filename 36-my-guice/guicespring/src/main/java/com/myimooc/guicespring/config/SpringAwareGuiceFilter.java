package com.myimooc.guicespring.config;

import javax.servlet.annotation.WebFilter;

import com.google.inject.servlet.GuiceFilter;

/**
 * @author zc
 * @version 1.0 2017-10-15
 * @title 配置类
 * @describe 注册GuiceFilter
 */
@WebFilter
public class SpringAwareGuiceFilter extends GuiceFilter {

}
