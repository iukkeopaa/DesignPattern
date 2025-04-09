package org.wqz.ChainOfResponsibility;

// 具体处理者类 1
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
