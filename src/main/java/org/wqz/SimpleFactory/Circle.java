package org.wqz.SimpleFactory;

/**
 * @Description: 具体的图形圆的实现类
 * @Author: wjh
 * @Date: 2025/4/9 上午8:59
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("drawing a circle");
    }
}
