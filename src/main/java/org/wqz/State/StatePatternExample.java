package org.wqz.State;

// 主类，用于测试
public class StatePatternExample {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.powerOn();
        phone.setFlightMode();
        phone.powerOff();
    }
}    