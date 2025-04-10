package org.wqz.Adapter.ObjectAdapter;

// 目标接口，代表电器需要的 110V 电压
interface TargetVoltage {
    int get110Voltage();
}

// 适配者类，代表提供 220V 电压的电源
class AdapteeVoltage {
    public int get220Voltage() {
        return 220;
    }
}

// 对象适配器类，实现目标接口，通过组合适配者对象来完成接口转换
class PowerObjectAdapter implements TargetVoltage {
    private AdapteeVoltage adaptee;

    public PowerObjectAdapter(AdapteeVoltage adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int get110Voltage() {
        // 将 220V 电压转换为 110V 电压
        return adaptee.get220Voltage() / 2;
    }
}

// 电器类，使用目标接口提供的 110V 电压
class ElectricalAppliance {
    public void operate(TargetVoltage voltage) {
        int v = voltage.get110Voltage();
        System.out.println("电器使用 " + v + "V 电压正常运行。");
    }
}

// 主类，用于测试对象适配器
public class ObjectPowerAdapterExample {
    public static void main(String[] args) {
        // 创建适配者对象，即 220V 电源
        AdapteeVoltage adaptee = new AdapteeVoltage();
        // 创建对象适配器对象，传入适配者对象
        TargetVoltage adapter = new PowerObjectAdapter(adaptee);
        // 创建电器对象
        ElectricalAppliance appliance = new ElectricalAppliance();
        // 电器使用适配器提供的电压运行
        appliance.operate(adapter);
    }
}    