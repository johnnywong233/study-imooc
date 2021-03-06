package com.myimooc.designpattern.c3proxy.simulationjdk;

import java.lang.reflect.Method;

/**
 * @author zc
 * @version 1.0 2017-08-28
 * @describe 模拟JDK动态代理-业务处理类
 */
public interface InvocationHandler {

    public void invoke(Object obj, Method method);

}
