package com.RerunFailTestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestCase1 {

    @Test
    public void testmethod1(){
        Assert.assertTrue(true);
        System.out.println("testmethod1 is working fine");
    }
}
