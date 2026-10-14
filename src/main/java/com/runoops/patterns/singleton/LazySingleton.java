package com.runoops.patterns.singleton;

/**
 * 懒汉式单例（非线程安全）：第一次调用才创建实例。
 * 多线程环境可能创建多个实例，生产禁用。
 * 参考：https://runoops.com/design-patterns-singleton.html
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("LazySingleton: " + this);
    }
}
