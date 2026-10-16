package com.runoops.patterns.frontcontroller;

/**
 * Front Controller: single entry for common processing then dispatch
 */
public class FrontController {
    private final Dispatcher dispatcher;

    public FrontController() {
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticate() {
        // simulate authentication
        return true;
    }

    private void trackRequest(String request) {
        System.out.println("Request log: " + request);
    }

    public void dispatchRequest(String request) {
        // common processing
        trackRequest(request);
        if (isAuthenticate()) {
            dispatcher.dispatch(request);
        }
    }
}
