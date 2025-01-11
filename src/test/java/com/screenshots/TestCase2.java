package com.screenshots;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListnersClass.class)
public class TestCase2 extends BaseClass {

    @BeforeTest
    public void setup(){
        intialize();
    }


    @Test
    public void testMethod2(){
        String parentID = driver.getWindowHandle();
        System.out.println("Parent Window"+parentID);
        driver.findElement(By.xpath("//a[text()='http://www.Selenium143.blogspot.com']")).click();
        driver.findElement(By.xpath("//div[@id='sidebar-left-1djhfjsfkjs']/div[17]/div/p")).click();
    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }


}
