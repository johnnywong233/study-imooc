package com.myimooc.myproxydemo.chain;

/**
 * @author zc
 * @version 1.0 2017-09-13
 * @title 责任链模式
 * @describe 测试类
 */
public class Client {

    public static void main(String[] args) {
        HandlerA handlerA = new HandlerA();
        HandlerB HandlerB = new HandlerB();
        HandlerC HandlerC = new HandlerC();
        // 设置链接关系
        handlerA.setSucessor(HandlerB);
        HandlerB.setSucessor(HandlerC);

        handlerA.execute();
    }

    static class HandlerA extends Handler {
        @Override
        protected void handleProcess() {
            System.out.println("handle by a");
        }
    }

    static class HandlerB extends Handler {
        @Override
        protected void handleProcess() {
            System.out.println("handle by b");
        }
    }

    static class HandlerC extends Handler {
        @Override
        protected void handleProcess() {
            System.out.println("handle by c");
        }
    }
}
