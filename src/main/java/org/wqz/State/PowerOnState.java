package org.wqz.State;

// 开机状态类
class PowerOnState implements PhoneState {
    @Override
    public void powerOn() {
        System.out.println("手机已经开机");
    }

    @Override
    public void powerOff() {
        System.out.println("手机关机");
    }

    @Override
    public void setFlightMode() {
        System.out.println("开启飞行模式");
    }
}