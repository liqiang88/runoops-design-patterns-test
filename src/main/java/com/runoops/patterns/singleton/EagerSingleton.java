package com.runoops.patterns.singleton;

/**
 * 饿汉式单例：类加载时直接初始化，天生线程安全。
 * 参考：https://runoops.com/design-patterns-singleton.html
 */
public class EagerSingleton {

    // 类加载直接实例化
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    // 私有构造，禁止外部 new
    private EagerSingleton() {}

    // 全局访问点
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("EagerSingleton: " + this);
    }
}
