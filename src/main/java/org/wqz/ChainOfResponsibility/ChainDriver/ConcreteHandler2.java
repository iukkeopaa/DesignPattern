package org.wqz.ChainOfResponsibility.ChainDriver;

// 具体处理者 2
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