package com.imooc.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public void invoke(Object o, Method m) {

        try {
            long starttime = System.currentTimeMillis();
            System.out.println("������ʼ��ʻ....");
            m.invoke(target);
            long endtime = System.currentTimeMillis();
            System.out.println("����������ʻ....  ������ʻʱ�䣺"
                    + (endtime - starttime) + "���룡");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
