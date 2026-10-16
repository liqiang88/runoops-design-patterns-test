package com.runoops.patterns.interceptingfilter;

/**
 * ConcreteFilter: logging
 */
public class LogFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("LogFilter: Log request: " + request);
    }
}
