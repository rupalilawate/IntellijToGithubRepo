package com.RerunFailTestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestCase2 {

    @Test
    public void testmethod2(){
        Assert.assertTrue(false);
        System.out.println("testmethod2 is not working fine");
    }
}
