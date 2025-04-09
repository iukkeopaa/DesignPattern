package org.wqz.Proxy.源码分析;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 定义接口
interface Subject {
    void request();
}

// 实现接口的真实类
class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}

// 实现 InvocationHandler 接口的代理处理器
class ProxyHandler implements InvocationHandler {
    private final Object target;

    public ProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 在调用真实对象方法之前的增强逻辑
        System.out.println("Before method call.");
        // 调用真实对象的方法
        Object result = method.invoke(target, args);
        // 在调用真实对象方法之后的增强逻辑
        System.out.println("After method call.");
        return result;
    }
}

// 测试代理模式
public class ProxyPatternDemo {
    public static void main(String[] args) {
        // 创建真实对象
        RealSubject realSubject = new RealSubject();
        // 创建代理处理器
        ProxyHandler handler = new ProxyHandler(realSubject);
        // 创建代理对象
        Subject proxySubject = (Subject) Proxy.newProxyInstance(
                Subject.class.getClassLoader(),
                new Class<?>[]{Subject.class},
                handler
        );
        // 调用代理对象的方法
        proxySubject.request();
    }
}