package org.wqz.Singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}

    // 线程不安全的懒汉式
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}    