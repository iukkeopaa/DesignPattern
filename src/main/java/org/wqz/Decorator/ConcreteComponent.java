package org.wqz.Decorator;

// 具体组件类
class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("执行具体组件的操作");
    }
}