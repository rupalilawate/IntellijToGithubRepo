package com.report.allure;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Testcase3 {


    @Test
    public void testMethod3(){
        throw new SkipException("This test will be skipped");
    }
    @Test
    public void testMethod4(){
        throw new SkipException("This test will be skipped");
    }
    @Test
    public void testMethod5(){
        throw new SkipException("This test will be skipped");
    }



}
