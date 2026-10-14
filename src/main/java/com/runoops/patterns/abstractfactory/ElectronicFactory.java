package com.runoops.patterns.abstractfactory;

/**
 * 抽象工厂：电子产品工厂，可生产手机 + 耳机一组配套产品
 */
public interface ElectronicFactory {
    Phone createPhone();

    Headphone createHeadphone();
}
