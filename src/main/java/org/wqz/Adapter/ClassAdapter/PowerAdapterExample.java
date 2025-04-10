package org.wqz.Adapter.ClassAdapter;

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

// 类适配器类，继承适配者类并实现目标接口
class PowerAdapter extends AdapteeVoltage implements TargetVoltage {
    @Override
    public int get110Voltage() {
        // 将 220V 电压转换为 110V 电压
        return get220Voltage() / 2;
    }
}

// 电器类，使用目标接口提供的 110V 电压
class ElectricalAppliance {
    public void operate(TargetVoltage voltage) {
        int v = voltage.get110Voltage();
        System.out.println("电器使用 " + v + "V 电压正常运行。");
    }
}

// 主类，用于测试类适配器
public class PowerAdapterExample {
    public static void main(String[] args) {
        // 创建电器对象
        ElectricalAppliance appliance = new ElectricalAppliance();
        // 创建电源适配器对象
        TargetVoltage adapter = new PowerAdapter();
        // 电器使用适配器提供的电压运行
        appliance.operate(adapter);
    }
}    