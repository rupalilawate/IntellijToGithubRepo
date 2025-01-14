package selenium.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class amazoneXpath {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://www.amazon.com/events/wintersale?ref_=nav_cs_gb");
        //driver.findElement(By.xpath("(//div[@class='nav-fill'])[3]//a[1]")).click();
        List<WebElement> l1 = driver.findElements(By.xpath("//span[text()='Limited time deal']/following::span[2]"));
        int size = l1.size();

        for(int i=0; i<size-1; i++){

            System.out.println(l1.get(i).getText());
        }

        driver.quit();


    }
}
