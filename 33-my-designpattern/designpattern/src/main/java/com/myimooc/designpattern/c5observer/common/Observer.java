package com.myimooc.designpattern.c5observer.common;

/**
 * @author zc
 * @version 1.0 2017-08-29
 * @describe 观察者接口，定义一个更新的接口给那些在目标对象发生改变的时候被通知的对象
 */
public interface Observer {

    /**
     * 更新的接口
     *
     * @param subject 传入的目标对象，方便获取相应的目标对象的状态
     */
    void update(Subject subject);

}
