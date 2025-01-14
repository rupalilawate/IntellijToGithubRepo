package selenium.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MakeMytrip {


    WebDriver driver;

    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://www.makemytrip.com/flight/search?tripType=O&itinerary=BOM-DEL-13/01/2025&paxType=A-1_C-0_I-0&cabinClass=E&sTime=1736704404966&forwardFlowRequired=true&mpo=&semType=&intl=false");

    }

    @Test
    public void lowestPriceFlights(){
        List<WebElement> e1 = driver.findElements(By.xpath("//p[text()='per adult']/preceding-sibling::span[contains(text(),'₹ 5')]"));
        for(WebElement e2:e1){
            String flightPrice = e2.getText();
            System.out.println("Lowest Price Flights are:   "+ flightPrice);
        }
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }


}
