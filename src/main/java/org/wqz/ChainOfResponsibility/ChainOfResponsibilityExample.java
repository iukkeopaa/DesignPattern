package org.wqz.ChainOfResponsibility;

// 客户端类
public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        // 创建处理者对象
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        // 设置责任链
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        // 发送请求
        handler1.handleRequest(5);
        handler1.handleRequest(15);
        handler1.handleRequest(25);
    }
}    