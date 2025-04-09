package org.wqz.Prototype;

import org.wqz.SimpleFactory.Circle;

// 客户端代码，用于测试原型模式
public class PrototypePatternExample {
    public static void main(String[] args) {
        // 创建一个 Rectangle 对象
        Rectangle rectangle = new Rectangle();
        // 克隆 Rectangle 对象
        Rectangle clonedRectangle = (Rectangle) rectangle.clone();

        // 创建一个 Circle 对象
        Circle circle = new Circle();
        // 克隆 Circle 对象
//        Circle clonedCircle = (Circle) circle.clone()

        // 输出克隆对象的类型
        System.out.println("Cloned Rectangle Type: " + clonedRectangle.getType());
//        System.out.println("Cloned Circle Type: " + clonedCircle.getType());

        // 调用克隆对象的 draw 方法
        clonedRectangle.draw();
//        clonedCircle.draw();
    }
}    