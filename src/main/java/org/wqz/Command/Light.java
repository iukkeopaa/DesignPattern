package org.wqz.Command;

// 电灯类
class Light {
    private boolean isOn;

    public Light() {
        this.isOn = false;
    }

    public void turnOn() {
        if (!isOn) {
            System.out.println("电灯已打开");
            isOn = true;
        }
    }

    public void turnOff() {
        if (isOn) {
            System.out.println("电灯已关闭");
            isOn = false;
        }
    }
}
