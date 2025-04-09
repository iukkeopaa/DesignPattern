package org.wqz.Prototype;

// 定义 Circle 类，继承自 Shape
class Circle extends Shape {
    public Circle() {
        this.type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}    