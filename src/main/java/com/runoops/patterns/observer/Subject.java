package com.runoops.patterns.observer;

/**
 * Subject: register / remove / notify observers
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
