package org.wqz.ChainOfResponsibility.ChainDriver;

// 具体处理者 3
class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("ConcreteHandler3 处理请求: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}    