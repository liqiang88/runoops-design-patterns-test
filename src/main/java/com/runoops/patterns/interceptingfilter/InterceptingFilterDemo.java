package com.runoops.patterns.interceptingfilter;

/**
 * Intercepting Filter pattern demo (client)
 * Article: https://runoops.com/design-patterns-intercepting-filter.html
 *
 * Request passes AuthenticationFilter -> LogFilter -> Target.
 */
public class InterceptingFilterDemo {
    private FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }

    public static void main(String[] args) {
        Target target = new Target();
        FilterManager filterManager = new FilterManager(target);

        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new LogFilter());

        InterceptingFilterDemo client = new InterceptingFilterDemo();
        client.setFilterManager(filterManager);
        client.sendRequest("GET /api/user");
    }
}
