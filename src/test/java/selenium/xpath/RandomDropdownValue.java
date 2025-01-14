package selenium.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

public class RandomDropdownValue {

    public static void main(String[] args) throws InterruptedException, IOException {


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.automationtesting.in/Register.html");
        JavascriptExecutor jse =((JavascriptExecutor)driver);
        Thread.sleep(2000);
        jse.executeScript("document.body.style.zoom='60%';");
        Thread.sleep(2000);
        WebElement dropdown = driver.findElement(By.id("Skills"));
        Select s1 = new Select(dropdown);
        int totalOptions = driver.findElements(By.cssSelector("#Skills>option")).size();
        Random randomvalue = new Random();
        int randomeNumber = randomvalue.nextInt(totalOptions);
        System.out.println(randomeNumber);

        s1.selectByIndex(randomeNumber);
        Thread.sleep(4000);
        WebElement scrollElement = driver.findElement(By.cssSelector("#Button1"));

        jse.executeScript("arguments[0].scrollIntoView(true);",scrollElement);
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Users\\Lenovo\\IdeaProjects\\MavenForJenkins\\DropdownSelect.jpg"));


        driver.quit();





    }


}
