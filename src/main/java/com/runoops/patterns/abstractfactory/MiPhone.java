package com.runoops.patterns.abstractfactory;

/**
 * 具体产品：小米手机
 */
public class MiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("小米手机拨打电话");
    }
}
