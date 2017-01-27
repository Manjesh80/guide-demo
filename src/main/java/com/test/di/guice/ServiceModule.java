package com.test.di.guice;

import com.google.inject.AbstractModule;
import com.test.di.service.Service;
import com.test.di.service.ServiceImpl;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 1/27/2017.
 */
public class ServiceModule extends AbstractModule {

    protected void configure() {
        bind(Service.class).to(ServiceImpl.class);
    }
}
