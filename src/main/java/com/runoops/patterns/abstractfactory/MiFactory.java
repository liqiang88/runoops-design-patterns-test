package com.runoops.patterns.abstractfactory;

/**
 * 具体工厂：小米产品族
 */
public class MiFactory implements ElectronicFactory {
    @Override
    public Phone createPhone() {
        return new MiPhone();
    }

    @Override
    public Headphone createHeadphone() {
        return new MiHeadphone();
    }
}
