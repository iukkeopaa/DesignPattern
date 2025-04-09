package org.wqz.Facade;

// 主类，包含程序入口点
public class FacadePatternExample {
    public static void main(String[] args) {
        // 创建电脑外观对象
        ComputerFacade computer = new ComputerFacade();

        // 启动电脑
        System.out.println("启动电脑:");
        computer.startComputer();

        // 关闭电脑
        System.out.println("\n关闭电脑:");
        computer.shutdownComputer();
    }
}    