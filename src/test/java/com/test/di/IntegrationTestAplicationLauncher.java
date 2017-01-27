package com.test.di;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 1/27/2017.
 */
public class IntegrationTestAplicationLauncher {

    @Test
    public void integrationTestApplicationLauncher() throws Exception {
        boolean result = CustomApplicationLauncher.launchApplication();
        Assert.assertTrue("Integration testing done", result);
    }
}

