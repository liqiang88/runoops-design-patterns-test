package com.runoops.patterns.observer;

/**
 * Observer pattern demo (client)
 * Article: https://runoops.com/design-patterns-observer.html
 *
 * WeatherStation notifies registered displays when temperature changes.
 */
public class ObserverDemo {

    public static void main(String[] args) {
        Subject weatherStation = new WeatherStation();
        Observer currentDisplay = new CurrentDisplay();
        Observer statDisplay = new StatDisplay();

        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(statDisplay);

        ((WeatherStation) weatherStation).setTemperature(25.6f);
        weatherStation.removeObserver(statDisplay);
        ((WeatherStation) weatherStation).setTemperature(28.1f);
    }
}
