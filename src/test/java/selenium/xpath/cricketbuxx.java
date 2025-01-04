package selenium.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class cricketbuxx {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/91814/aus-vs-ind-5th-test-india-tour-of-australia-2024-25");
        Thread.sleep(2000);
        String batsMan = " Sam Konstas ";
        String Run = driver.findElement(By.xpath("(//a[text()='"+batsMan+"'])[1]/parent::div/following-sibling::div[2]")).getText();
        System.out.println("Run of batsman:" + batsMan + "-  "+Run);
        String baller = " Jasprit Bumrah (c) ";
        String wicket = driver.findElement(By.xpath("(//a[text()='"+baller+"'])[1]/parent::div/following-sibling::div[4]")).getText();
        System.out.println("Wickets taken by " + baller + "-  "+wicket);
        driver.close();

    }
}
