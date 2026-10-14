package com.runoops.patterns.abstractfactory;

/**
 * 具体工厂：华为产品族
 */
public class HuaweiFactory implements ElectronicFactory {
    @Override
    public Phone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Headphone createHeadphone() {
        return new HuaweiHeadphone();
    }
}
