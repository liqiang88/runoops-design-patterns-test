package com.runoops.patterns.templatemethod;

/**
 * ConcreteClass: coffee
 */
public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Brew coffee grinds");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add milk and sugar");
    }
}
