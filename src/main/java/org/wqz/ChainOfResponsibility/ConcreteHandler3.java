package org.wqz.ChainOfResponsibility;

// 具体处理者类 3
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