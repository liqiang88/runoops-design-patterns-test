package com.runoops.patterns.interceptingfilter;

/**
 * ConcreteFilter: authentication
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("AuthenticationFilter: Authenticate request: " + request);
    }
}
