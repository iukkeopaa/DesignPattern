package org.wqz.AbstractFactory;

// 定义 macOS 风格的文本框
class MacOSTextBox implements TextBox {
    @Override
    public void draw() {
        System.out.println("macOS 风格的文本框");
    }
}