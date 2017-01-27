package com.test.di.mocks;

import com.test.di.service.Service;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 1/27/2017.
 */
public class MockServiceImpl implements Service {
    public boolean callExternalService(int number) {
        System.out.println("Calling Internal Service");
        return false;
    }
}
