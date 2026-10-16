package com.runoops.patterns.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Filter Chain: run filters then target
 */
public class FilterChain {
    private final List<Filter> filterList = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter) {
        filterList.add(filter);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void execute(String request) {
        for (Filter filter : filterList) {
            filter.execute(request);
        }
        target.execute(request);
    }
}
