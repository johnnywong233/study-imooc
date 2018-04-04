package com.imooc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        super();
        this.target = target;
    }

    /*
     * ������
     * proxy  ���������
     * method  ���������ķ���
     * args �����Ĳ���
     *
     * ����ֵ��
     * Object  �����ķ���ֵ
     * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        long starttime = System.currentTimeMillis();
        System.out.println("������ʼ��ʻ....");
        method.invoke(target);
        long endtime = System.currentTimeMillis();
        System.out.println("����������ʻ....  ������ʻʱ�䣺"
                + (endtime - starttime) + "���룡");
        return null;
    }

}
