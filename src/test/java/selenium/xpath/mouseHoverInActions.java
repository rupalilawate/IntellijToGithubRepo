package selenium.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class mouseHoverInActions {

    @Test
    public void mousehoverOnlement() throws InterruptedException {

            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
            driver.get("https://www.flipkart.com/helpcentre?otracker=footer_navlinks");
            WebElement ele = driver.findElement(By.xpath("(//span[@class='TSD49J'])[5]"));
            Actions action = new Actions(driver);
            action.moveToElement(ele).perform();
            Thread.sleep(3000);
            WebElement toys = driver.findElement(By.xpath("//a[text()='Musical Toys']"));
            action.sendKeys(toys,Keys.ENTER).build().perform();
            WebElement e2 = driver.findElement(By.xpath("//img[contains(@alt,'xelix Kids Rechargeable')]"));
            String price = driver.findElement(By.xpath("//img[contains(@alt,'xelix Kids Rechargeable')]/following::a[2]/div[1]")).getText();
            System.out.println("Musical Toy price: "+price);
            Assert.assertTrue(e2.isDisplayed());



        }

}
