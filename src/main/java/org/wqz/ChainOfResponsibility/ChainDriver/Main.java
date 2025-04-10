package org.wqz.ChainOfResponsibility.ChainDriver;

// 主类，驱动责任链
public class Main {
    public static void main(String[] args) {
        // 创建处理者
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        // 设置责任链
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        // 发送请求
        int[] requests = {2, 15, 25};
        for (int request : requests) {
            handler1.handleRequest(request);
        }
    }
}    