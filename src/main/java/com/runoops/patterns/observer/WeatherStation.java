package com.runoops.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteSubject: weather station
 */
public class WeatherStation implements Subject {
    private final List<Observer> observerList = new ArrayList<>();
    private float temperature;

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(temperature);
        }
    }
}
