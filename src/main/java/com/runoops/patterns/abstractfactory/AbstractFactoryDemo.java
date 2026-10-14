package com.runoops.patterns.abstractfactory;

/**
 * 抽象工厂模式演示（客户端）
 * 文章：https://runoops.com/ddesign-patterns-abstract-factory.html
 *
 * 客户端只依赖 ElectronicFactory、Phone、Headphone 抽象，
 * 切换工厂即可切换整套产品族。
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        // 切换工厂即可切换整套产品族
        ElectronicFactory factory = new MiFactory();
        Phone phone = factory.createPhone();
        Headphone headphone = factory.createHeadphone();
        phone.call();
        headphone.listen();

        System.out.println("=====切换华为产品族=====");
        factory = new HuaweiFactory();
        phone = factory.createPhone();
        headphone = factory.createHeadphone();
        phone.call();
        headphone.listen();
    }
}
