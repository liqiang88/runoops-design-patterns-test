package com.runoops.patterns.prototype;

/**
 * 原型模式演示：浅拷贝 vs 深拷贝
 * 文章：https://runoops.com/design-patterns-prototype.html
 */
public class PrototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("========== 1. 浅拷贝 ==========");
        Address address = new Address("杭州");
        User prototype = new User("张三", 20, address);

        User cloneUser = prototype.clone();
        System.out.println("原型对象：" + prototype);
        System.out.println("克隆对象：" + cloneUser);

        // 浅拷贝：引用对象地址是同一个，改克隆会影响原型
        cloneUser.getAddress().setCity("上海");
        System.out.println("修改克隆对象地址后，原型对象：" + prototype);

        System.out.println("\n========== 2. 深拷贝 ==========");
        Address deepAddress = new Address("杭州");
        DeepUser deepPrototype = new DeepUser("张三", 20, deepAddress);

        DeepUser deepClone = deepPrototype.clone();
        System.out.println("原型对象：" + deepPrototype);
        System.out.println("克隆对象：" + deepClone);

        deepClone.getAddress().setCity("上海");
        System.out.println("修改克隆对象地址后，原型对象：" + deepPrototype);
        System.out.println("克隆对象：" + deepClone);
    }
}
