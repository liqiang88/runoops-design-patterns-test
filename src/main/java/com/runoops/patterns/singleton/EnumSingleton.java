package com.runoops.patterns.singleton;

/**
 * 枚举单例（Effective Java 推荐）：防反射、防序列化破坏，最安全。
 * 参考：https://runoops.com/design-patterns-singleton.html
 */
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("枚举单例业务方法: " + this);
    }
}
