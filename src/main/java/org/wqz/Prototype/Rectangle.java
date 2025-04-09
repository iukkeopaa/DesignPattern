package org.wqz.Prototype;

// 定义 Rectangle 类，继承自 Shape
class Rectangle extends Shape {
    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}    