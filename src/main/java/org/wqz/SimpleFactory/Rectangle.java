package org.wqz.SimpleFactory;

/**
 * @Description: 具体的图形矩阵的实现类
 * @Author: wjh
 * @Date: 2025/4/9 上午9:00
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
