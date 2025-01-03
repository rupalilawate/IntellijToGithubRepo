package selenium.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

import java.time.Duration;

public class dynamicdropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/select-menu");

        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("document.body.style.zoom='60%';");
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//div[contains(@class,' css-1wy0on6')])[1]")).click();
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class=' css-26l3qy-menu']/descendant::div//div[text()='Another root option']")).click();


    }
}
