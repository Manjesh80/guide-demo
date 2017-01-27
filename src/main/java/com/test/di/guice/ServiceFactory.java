package com.test.di.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.test.di.service.Service;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 1/27/2017.
 */
public class ServiceFactory {
    private final Injector serviceInjector;

    ServiceFactory(ServiceModule serviceModule) {
        serviceInjector = Guice.createInjector(serviceModule);
    }

    public static ServiceFactory create() {
        final ServiceFactory serviceFactory = new ServiceFactory(new ServiceModule());
        return serviceFactory;
    }

    public Service createService() {
        return serviceInjector.getInstance(Service.class);
    }
}
