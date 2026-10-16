package com.runoops.patterns.compositeview;

/**
 * Concrete View Component: footer
 */
public class FooterView implements ViewComponent {
    @Override
    public void render() {
        System.out.println("==== Page Footer ====");
    }
}
