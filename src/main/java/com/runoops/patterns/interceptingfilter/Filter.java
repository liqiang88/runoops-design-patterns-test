package com.runoops.patterns.interceptingfilter;

/**
 * Filter: intercept request
 * Ref: https://runoops.com/design-patterns-intercepting-filter.html
 */
public interface Filter {
    void execute(String request);
}
