package testConfig;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseChromeTest {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public static void setup () {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void teardown () {
        driver.quit();
    }
}