package com.runoops.patterns.abstractfactory;

/**
 * 具体产品：华为手机
 */
public class HuaweiPhone implements Phone {
    @Override
    public void call() {
        System.out.println("华为手机拨打电话");
    }
}
