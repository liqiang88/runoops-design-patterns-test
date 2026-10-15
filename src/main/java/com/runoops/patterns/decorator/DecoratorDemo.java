package com.runoops.patterns.decorator;

/**
 * Decorator pattern demo (client)
 * Article: https://runoops.com/design-patterns-decorator.html
 *
 * Dynamically wrap coffee with milk/sugar without subclass explosion.
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " | Price: " + coffee.getPrice());

        // add milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " | Price: " + coffee.getPrice());

        // add sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " | Price: " + coffee.getPrice());
    }
}
