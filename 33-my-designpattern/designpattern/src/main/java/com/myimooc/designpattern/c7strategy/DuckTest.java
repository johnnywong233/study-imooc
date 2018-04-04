package com.myimooc.designpattern.c7strategy;

/**
 * @author zc
 * @version 1.0 2017-08-31
 * @title 策略模式
 * @describe 测试类
 */
public class DuckTest {

    public static void main(String[] args) {
        System.out.println("测试鸭子程序");
        System.out.println("*************************");

        Duck duck = null;
//		duck = new MallardDuck();
//		duck = new RedheadDuck();
//		duck = new RubberDuck();
//		duck = new BigYellowDuck();
        duck = new SpaceDuck();

        duck.display();
        duck.quack();
        duck.fly();

        System.out.println("*************************");
        System.out.println("测试程序完毕");
    }

}
