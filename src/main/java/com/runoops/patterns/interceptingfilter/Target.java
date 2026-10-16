package com.runoops.patterns.interceptingfilter;

/**
 * Target: final business resource
 */
public class Target {
    public void execute(String request) {
        System.out.println("Target: Processing request: " + request);
    }
}
