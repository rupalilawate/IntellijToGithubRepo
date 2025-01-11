package com.screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;
import java.util.Date;

public class BaseClass {

    public static WebDriver driver;

    public static void intialize(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://omayo.blogspot.com/");
    }


    public void captureScreenshots(String methodname){
        Date d = new Date();
        String timpstamp = d.toString().replace(":","_").replace(" ","");
        System.out.println(timpstamp);
        try{
            File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(file,new File("C:\\Users\\Lenovo\\IdeaProjects\\MavenForJenkins\\src\\test\\java\\com\\screenshots\\"+methodname+timpstamp+".jpg"));
        }
        catch(Exception e){
            e.getMessage();
        }
    }








}
