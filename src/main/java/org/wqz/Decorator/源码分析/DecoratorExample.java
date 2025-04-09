package org.wqz.Decorator.源码分析;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//装饰器模式能够动态地给一个对象添加额外的职责。在 JDK 里，java.io 包中的输入输出流类就运用了装饰器模式。
//在这个例子中，BufferedInputStream 类对 FileInputStream 类进行了装饰，为其添加了缓冲功能。
public class DecoratorExample {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("test.txt");
            //
            InputStream bufferedInputStream = new BufferedInputStream(inputStream);
            int data;
            while ((data = bufferedInputStream.read()) != -1) {
                // 处理数据
            }
            bufferedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}