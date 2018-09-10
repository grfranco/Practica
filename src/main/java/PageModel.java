import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageModel {
    public WebDriver driver;
    public WebDriverWait wait;

    public PageModel(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void click(By elementLocation) {
        driver.findElement(elementLocation).click();
    }

    public void fillText(By elementLocation, String text) {
        driver.findElement(elementLocation).sendKeys(text);
    }
}