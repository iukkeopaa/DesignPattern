package org.wqz.ChainOfResponsibility.ChainDriver;

// 定义处理者接口
abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(int request);
}    