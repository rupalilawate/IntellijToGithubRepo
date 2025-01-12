package com.CrossBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
    WebDriver driver;
    FirefoxOptions firefoxoptions = new FirefoxOptions();
    ChromeOptions chromeoptions = new ChromeOptions();
    EdgeOptions edgeoptions = new EdgeOptions();

    @Parameters("browser")
    @BeforeTest
    public void intialize(String browser){
        if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            System.out.println("firfox is launched");
        }
        else if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println("chrome is launched");
        }
        else if(browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            System.out.println("edge is launched");
        }
        else {
            System.out.println("Browser not launch");
        }
    }

    @Test
    public void loginTest(){
        driver.get("https://tutorialsninja.com/demo/");
        Assert.assertTrue(driver.getTitle().contains("Your Store"), "Title does not match");
        System.out.println("test successfully passed");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }


}
