package selenium.xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionClass {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        Dimension dimens = new Dimension(300,800);
        driver.manage().window().setSize(dimens);
        driver.get("https://omayo.blogspot.com/");

    }
}
