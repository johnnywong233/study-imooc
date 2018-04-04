package com.imooc.pattern.template;

public class RefreshBeverageTest {

    public static void main(String[] args) {

        System.out.println("�Ʊ�����...");
        RefreshBeverage b1 = new Coffee();
        b1.prepareBeverageTemplate();
        System.out.println("���Ⱥ��ˣ�");

        System.out.println("\n******************************************");

        System.out.println("�Ʊ���...");
        RefreshBeverage b2 = new Tea();
        b2.prepareBeverageTemplate();
        System.out.println("����ˣ�");

    }

}
