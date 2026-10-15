package com.runoops.patterns.templatemethod;

/**
 * AbstractClass: beverage prepare template
 * Ref: https://runoops.com/design-patterns-template-method.html
 */
public abstract class Beverage {
    // template method, fixed algorithm skeleton
    public final void prepare() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    private void boilWater() {
        System.out.println("Boil water");
    }

    private void pourInCup() {
        System.out.println("Pour into cup");
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    // hook method, optional override
    protected boolean customerWantsCondiments() {
        return true;
    }
}
