package com.test.di;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: mg153v (Manjesh Gowda). Creation Date: 1/27/2017.
 */
public class UnitTestAplicationLauncher {

    @Test
    public void unitTestApplicationLauncher() throws Exception {

        // The CustomApplicationLauncher should internally use MockServiceImpl
        boolean result = CustomApplicationLauncher.launchApplication();
        Assert.assertFalse("Unit testing done", result);
    }
}
