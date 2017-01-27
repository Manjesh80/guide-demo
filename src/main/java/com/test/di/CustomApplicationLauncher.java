package com.test.di;

import com.test.di.guice.ServiceFactory;
import com.test.di.service.Service;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 1/27/2017.
 */
public class CustomApplicationLauncher {

    public static boolean launchApplication() {
        Service myService = ServiceFactory.create().createService();
        return myService.callExternalService(2);
    }
}
