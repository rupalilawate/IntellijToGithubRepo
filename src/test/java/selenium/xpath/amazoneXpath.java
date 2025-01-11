package selenium.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class amazoneXpath {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        WebElement e1 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        e1.click();
        Thread.sleep(2000);
        Actions a1 = new Actions(driver);
        a1.sendKeys("iphone").sendKeys(Keys.ENTER).build().perform();






    }
}
