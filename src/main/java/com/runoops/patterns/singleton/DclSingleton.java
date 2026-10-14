package com.runoops.patterns.singleton;

/**
 * 双重检查锁 DCL：懒加载 + 线程安全，volatile 防止指令重排。
 * 参考：https://runoops.com/design-patterns-singleton.html
 */
public class DclSingleton {

    // volatile 禁止指令重排
    private static volatile DclSingleton instance;

    private DclSingleton() {}

    public static DclSingleton getInstance() {
        if (instance == null) {          // 第一次检查
            synchronized (DclSingleton.class) {
                if (instance == null) {  // 第二次检查
                    instance = new DclSingleton();
                }
            }
        }
        return instance;
    }

    public void sayHello() {
        System.out.println("DclSingleton: " + this);
    }
}
