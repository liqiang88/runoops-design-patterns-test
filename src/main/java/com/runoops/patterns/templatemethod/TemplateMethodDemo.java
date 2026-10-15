package com.runoops.patterns.templatemethod;

/**
 * Template Method demo (client)
 * Article: https://runoops.com/design-patterns-template-method.html
 *
 * Fixed prepare() skeleton; Coffee/Tea customize brew and condiments.
 */
public class TemplateMethodDemo {

    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.prepare();

        System.out.println("---");

        Beverage tea = new Tea();
        tea.prepare();
    }
}
