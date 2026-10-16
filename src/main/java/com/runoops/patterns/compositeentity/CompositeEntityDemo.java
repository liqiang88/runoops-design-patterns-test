package com.runoops.patterns.compositeentity;

/**
 * Composite Entity pattern demo (client)
 * Article: https://runoops.com/design-patterns-composite-entiy.html
 *
 * Client only talks to CompositeEntity; dependents stay hidden.
 */
public class CompositeEntityDemo {

    public static void main(String[] args) {
        CompositeEntity compositeEntity = new CompositeEntity();

        compositeEntity.setData("ZhangSan", "HangZhou");
        String[] data = compositeEntity.getData();
        System.out.println("Name: " + data[0]);
        System.out.println("Address: " + data[1]);

        compositeEntity.setData("LiSi", "ShangHai");
        data = compositeEntity.getData();
        System.out.println("Name: " + data[0]);
        System.out.println("Address: " + data[1]);
    }
}
