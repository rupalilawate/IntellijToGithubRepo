package com.screenshots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersClass extends BaseClass implements ITestListener {

    public void onTestFailure(ITestResult result){
        System.out.println("Test is Failed");
        try{
            captureScreenshots(result.getName());
        }
        catch (Exception e){
            e.getMessage();
        }
    }




}
