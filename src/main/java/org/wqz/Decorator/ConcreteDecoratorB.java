package org.wqz.Decorator;

// 另一个具体装饰器类
class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    private void addedBehavior() {
        System.out.println("执行具体装饰器 B 的附加操作");
    }
}