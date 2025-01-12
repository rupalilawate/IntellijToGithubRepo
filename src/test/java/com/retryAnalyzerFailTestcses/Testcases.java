package com.retryAnalyzerFailTestcses;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcases {


    WebDriver driver;
    @BeforeTest
    public void beforetest()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }
    @AfterTest
    public void aftertest(){
        driver.quit();

    }
    @Test(retryAnalyzer = RerunAutomationScript.class)
    public void testmethod(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"google");
    }


}
