package org.wqz.SimpleFactory;

/**
 * @Description: 工厂类
 * @Author: wjh
 * @Date: 2025/4/9 上午9:01
 */
public class ShapeFactory {

    public static Shape createShape(String shapeType) {
        if ("circle".equalsIgnoreCase(shapeType)) {
            return new Circle();
        } else if ("rectangle".equalsIgnoreCase(shapeType)) {
            return new Rectangle();
        }
        return null;
    }
}
