package org.wqz.State;

// 关机状态类
class PowerOffState implements PhoneState {
    @Override
    public void powerOn() {
        System.out.println("手机开机");
    }

    @Override
    public void powerOff() {
        System.out.println("手机已经关机");
    }

    @Override
    public void setFlightMode() {
        System.out.println("请先开机");
    }
}