package com.runoops.patterns.frontcontroller;

/**
 * Dispatcher: route request to view
 */
public class Dispatcher {
    private final HomeView homeView;
    private final StudentView studentView;

    public Dispatcher() {
        homeView = new HomeView();
        studentView = new StudentView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("home")) {
            homeView.show();
        } else if (request.equalsIgnoreCase("student")) {
            studentView.show();
        }
    }
}
