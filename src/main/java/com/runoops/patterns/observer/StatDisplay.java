package com.runoops.patterns.observer;

/**
 * ConcreteObserver: statistics display
 */
public class StatDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("StatDisplay: temperature = " + temperature);
    }
}
