package com.runoops.patterns.frontcontroller;

/**
 * Front Controller pattern demo (client)
 * Article: https://runoops.com/design-patterns-front-controller.html
 *
 * All requests enter FrontController for auth/log, then Dispatcher routes views.
 */
public class FrontControllerDemo {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("home");
        frontController.dispatchRequest("student");
    }
}
