package org.wqz.SimpleFactory;

/**
 * @Description: 测试类
 * @Author: wjh
 * @Date: 2025/4/9 上午9:02
 */
public class ShapeFactoryExample {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("circle");
        if (circle != null) {
            circle.draw();
        }

        Shape rectangle = ShapeFactory.createShape("rectangle");
        if (rectangle != null) {
            rectangle.draw();
        }
    }
}
