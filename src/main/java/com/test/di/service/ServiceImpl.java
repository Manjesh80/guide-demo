package com.test.di.service;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 1/27/2017.
 */
public class ServiceImpl implements Service {
    public boolean callExternalService(int number) {
        System.out.println("Calling External Service");
        return true;
    }
}
