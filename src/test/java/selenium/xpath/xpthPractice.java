package selenium.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xpthPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//a[text()='Search']")).click();
        Thread.sleep(3000);
        String flighthours = driver.findElement(By.xpath("(//div[@class='timingOptionOuter'])[2]//child::div[@class='stop-info flexOne']/p")).getText();
        System.out.println(flighthours);



    }
}
