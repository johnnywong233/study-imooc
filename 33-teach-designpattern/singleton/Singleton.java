package com.imooc;

/*
 * ����ģʽSingleton
 * Ӧ�ó��ϣ���Щ����ֻ��Ҫһ�����㹻�ˣ���Ŵ��ʵۡ�����
 * ���ã���֤����Ӧ�ó�����ĳ��ʵ������ֻ��һ��
 * ���ͣ�����ģʽ������ģʽ
 */
public class Singleton {
    //2.�������Ψһʵ����ʹ��private static����
    private static Singleton instance = new Singleton();

    //1.�����췽��˽�л����������ⲿֱ�Ӵ�������
    private Singleton() {
    }

    //3.�ṩһ�����ڻ�ȡʵ���ķ�����ʹ��public static����
    public static Singleton getInstance() {
        return instance;
    }
}
