package org.wqz.AbstractFactory;



// 客户端代码
public class AbstractFactoryExample {
    public static void createGUI(GUIFactory factory) {
        Button button = factory.createButton();
        TextBox textBox = factory.createTextBox();
        button.paint();
        textBox.draw();
    }

    public static void main(String[] args) {
        // 使用 Windows 风格的工厂
        GUIFactory windowsFactory = new WindowsFactory();
        createGUI(windowsFactory);

        // 使用 macOS 风格的工厂
        GUIFactory macosFactory = new MacOSFactory();
        createGUI(macosFactory);
    }
}  