package com.runoops.patterns.facade;

/**
 * SubSystem: light
 * Ref: https://runoops.com/design-patterns-facede.html
 */
public class Light {
    public void dim() {
        System.out.println("Light dim to low brightness");
    }

    public void bright() {
        System.out.println("Light turn to bright");
    }
}
