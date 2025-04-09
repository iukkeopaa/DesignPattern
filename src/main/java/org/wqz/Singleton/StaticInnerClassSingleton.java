package org.wqz.Singleton;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {}

    // 静态内部类，在类加载时不会初始化，只有在调用 getInstance 方法时才会加载
    private static class SingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    // 提供全局访问点
    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}    