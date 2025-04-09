package org.wqz.AbstractFactory;

// 定义 macOS 风格的按钮
class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("macOS 风格的按钮");
    }
}