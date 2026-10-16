package com.runoops.patterns.compositeview;

/**
 * Concrete View Component: header
 */
public class HeaderView implements ViewComponent {
    @Override
    public void render() {
        System.out.println("==== Page Header ====");
    }
}
