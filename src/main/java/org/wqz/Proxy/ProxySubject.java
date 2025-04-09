package org.wqz.Proxy;

// 代理类，持有真实主题类的引用
class ProxySubject implements Subject {
    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("代理类在请求前进行一些操作");
        realSubject.request();
        System.out.println("代理类在请求后进行一些操作");
    }
}    