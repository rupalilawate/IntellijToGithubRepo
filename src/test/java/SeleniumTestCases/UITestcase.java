package SeleniumTestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class UITestcase {


    @Parameters("Browser")
    @Test
    public void startBrowser(String browserName) {

        System.out.println("Parameter value is: " + browserName);

        WebDriver driver = null;
        if(browserName.contains("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browserName.contains("Edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tutorialsninja.com/demo/");
        Assert.assertTrue(driver.getTitle().contains("Your Store"), "Title does not match");
        System.out.println("test successfully passed");
        driver.quit();
    }





}
