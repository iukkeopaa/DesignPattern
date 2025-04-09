package org.wqz.Command;

// 测试类
public class CommandPatternExample {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommands(lightOn, lightOff);

        // 打开电灯
        remote.pressOnButton();
        // 关闭电灯
        remote.pressOffButton();
        // 撤销操作
        remote.pressUndoButton();
    }
}    