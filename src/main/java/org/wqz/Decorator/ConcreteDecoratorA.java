package org.wqz.Decorator;

// 具体装饰器类
class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("执行具体装饰器 A 的附加操作");
    }
}