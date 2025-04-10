package org.wqz.ChainOfResponsibility.SelfDriver;

// 抽象处理器类
abstract class Handler {
    protected Handler nextHandler;

    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public abstract void handleRequest(int request);
}

// 具体处理器类 1
class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request < 10) {
            System.out.println("ConcreteHandler1 处理请求: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

// 具体处理器类 2
class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("ConcreteHandler2 处理请求: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

// 具体处理器类 3
class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20) {
            System.out.println("ConcreteHandler3 处理请求: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

// 客户端类
public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        // 创建处理器
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        // 构建责任链
        handler1.setNextHandler(handler2).setNextHandler(handler3);

        // 发送请求
        handler1.handleRequest(5);
        handler1.handleRequest(15);
        handler1.handleRequest(25);
    }
}    