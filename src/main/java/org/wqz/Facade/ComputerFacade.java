package org.wqz.Facade;

// ComputerFacade 类，作为外观类，提供统一的启动和关闭电脑的接口
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    // 启动电脑的方法，依次启动各个组件
    public void startComputer() {
        cpu.start();
        memory.start();
        hardDrive.start();
        System.out.println("电脑启动成功");
    }

    // 关闭电脑的方法，依次关闭各个组件
    public void shutdownComputer() {
        cpu.shutdown();
        memory.shutdown();
        hardDrive.shutdown();
        System.out.println("电脑关闭成功");
    }
}