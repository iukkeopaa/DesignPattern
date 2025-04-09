package org.wqz.State;

// 飞行模式状态类
class FlightModeState implements PhoneState {
    @Override
    public void powerOn() {
        System.out.println("手机已经开机，当前处于飞行模式");
    }

    @Override
    public void powerOff() {
        System.out.println("关闭飞行模式，手机关机");
    }

    @Override
    public void setFlightMode() {
        System.out.println("手机已经处于飞行模式");
    }
}