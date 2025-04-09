package org.wqz.AbstractFactory;

// 定义 Windows 风格的文本框
class WindowsTextBox implements TextBox {
    @Override
    public void draw() {
        System.out.println("Windows 风格的文本框");
    }
}