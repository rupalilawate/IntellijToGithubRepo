package selenium.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class multipleWindowhandle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.get("https://omayo.blogspot.com/");
        String parentID = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()='http://www.Selenium143.blogspot.com']")).click();
        driver.findElement(By.xpath("//div[@id='sidebar-left-1']/div[17]/div/p")).click();
        Set<String> set = driver.getWindowHandles();
        for(String s1:set){
            driver.switchTo().window(s1);
            try{
                String text = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
                System.out.println("Switch to open window and get the text: "+ text);
                driver.quit();
                break;
            }catch(NoSuchElementException e)
            {
                driver.close();
            }
        }


    }
}
