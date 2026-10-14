package com.runoops.patterns.singleton;

/**
 * 单例模式演示：验证五种实现均为同一实例。
 * 文章：https://runoops.com/design-patterns-singleton.html
 */
public class SingletonDemo {

    public static void main(String[] args) {
        System.out.println("========== 1. 饿汉式 ==========");
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();
        eager1.sayHello();
        System.out.println("同一实例: " + (eager1 == eager2));

        System.out.println("\n========== 2. 懒汉式 ==========");
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        lazy1.sayHello();
        System.out.println("同一实例: " + (lazy1 == lazy2));

        System.out.println("\n========== 3. 双重检查锁 DCL ==========");
        DclSingleton dcl1 = DclSingleton.getInstance();
        DclSingleton dcl2 = DclSingleton.getInstance();
        dcl1.sayHello();
        System.out.println("同一实例: " + (dcl1 == dcl2));

        System.out.println("\n========== 4. 静态内部类 ==========");
        StaticInnerSingleton inner1 = StaticInnerSingleton.getInstance();
        StaticInnerSingleton inner2 = StaticInnerSingleton.getInstance();
        inner1.sayHello();
        System.out.println("同一实例: " + (inner1 == inner2));

        System.out.println("\n========== 5. 枚举单例 ==========");
        EnumSingleton.INSTANCE.doSomething();
        System.out.println("同一实例: " + (EnumSingleton.INSTANCE == EnumSingleton.INSTANCE));
    }
}
