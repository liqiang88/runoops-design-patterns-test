package com.runoops.patterns.templatemethod;

/**
 * ConcreteClass: tea (skip condiments via hook)
 */
public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Steep tea leaves");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add lemon");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return false;
    }
}
