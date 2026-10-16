package com.runoops.patterns.servicelocator;

import java.util.HashMap;
import java.util.Map;

/**
 * Service Locator: cache and return services by name
 */
public class ServiceLocator {
    private static final Map<String, Service> cache = new HashMap<>();
    private final InitialContext context;

    public ServiceLocator() {
        context = new InitialContext();
    }

    public Service getService(String serviceName) {
        if (cache.containsKey(serviceName)) {
            System.out.println("Get service from cache: " + serviceName);
            return cache.get(serviceName);
        }
        Service service = context.lookup(serviceName);
        if (service != null) {
            cache.put(serviceName, service);
            System.out.println("Create new service and put into cache: " + serviceName);
        }
        return service;
    }
}
