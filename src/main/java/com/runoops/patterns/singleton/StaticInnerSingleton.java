package com.runoops.patterns.singleton;

/**
 * 静态内部类单例：利用类加载机制实现懒加载，线程安全。
 * 参考：https://runoops.com/design-patterns-singleton.html
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton() {}

    // 静态内部类，只有调用时才加载
    private static class SingletonHolder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void sayHello() {
        System.out.println("StaticInnerSingleton: " + this);
    }
}
