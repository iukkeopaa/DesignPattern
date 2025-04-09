package org.wqz.Singleton;

public class EagerSingleton {
    // 在类加载时就创建实例
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // 私有构造函数，防止外部实例化
    private EagerSingleton() {}

    // 提供全局访问点
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}    