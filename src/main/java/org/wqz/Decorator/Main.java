package org.wqz.Decorator;

// 测试类
public class Main {
    public static void main(String[] args) {
        // 创建具体组件对象
        Component component = new ConcreteComponent();

        // 使用具体装饰器 A 包装组件
        Component decoratedComponentA = new ConcreteDecoratorA(component);

        // 使用具体装饰器 B 包装经过装饰器 A 包装的组件
        Component decoratedComponentB = new ConcreteDecoratorB(decoratedComponentA);

        // 调用操作
        decoratedComponentB.operation();
    }
}    