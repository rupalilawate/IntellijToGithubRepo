package selenium.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionsToMoveOnNewTabs {


    @Test
    public void switchToNewTabs() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("#opentab")).click();
        driver.findElement(By.cssSelector("#openwindow")).click();
        Thread.sleep(3000);
        Actions action = new Actions(driver);
        action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
        action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
        System.out.println("New tab titile is:  "+ driver.getTitle());
        Thread.sleep(8000);
        driver.quit();

    }



}
