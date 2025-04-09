package org.wqz.Proxy;

// 实现主题接口的真实主题类
class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实主题类处理请求");
    }
}    