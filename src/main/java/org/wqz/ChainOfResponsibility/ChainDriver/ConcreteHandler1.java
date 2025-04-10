package org.wqz.ChainOfResponsibility.ChainDriver;

// 具体处理者 1
class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("ConcreteHandler1 处理请求: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}    