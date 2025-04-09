package org.wqz.AbstractFactory;

// 定义抽象工厂的接口
interface GUIFactory {
    Button createButton();
    TextBox createTextBox();
}
