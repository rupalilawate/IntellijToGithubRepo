package selenium.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class GetshadowRoot {


    @Test
    public void shadowElement() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("chrome://settings/appearance");
        WebElement element = driver.findElement(By.xpath("//settings-ui")).getShadowRoot().findElement(By.cssSelector("settings-main#main"))
                .getShadowRoot().findElement(By.cssSelector("settings-basic-page.cr-centered-card-container")).getShadowRoot()
                .findElement(By.cssSelector("settings-section[section='appearance']")).findElement(By.tagName("settings-appearance-page"))
                .getShadowRoot().findElement(By.cssSelector("settings-toggle-button[label='Show home button']"))
                .getShadowRoot().findElement(By.cssSelector("cr-toggle#control"));
        Thread.sleep(2000);
        element.click();
        //driver.quit();

















    }







}
