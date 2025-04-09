package org.wqz.AbstractFactory;

// 定义 Windows 风格的按钮
class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows 风格的按钮");
    }
}