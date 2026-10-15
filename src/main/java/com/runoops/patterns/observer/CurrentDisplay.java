package com.runoops.patterns.observer;

/**
 * ConcreteObserver: current temperature display
 */
public class CurrentDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("CurrentDisplay: temperature = " + temperature);
    }
}
