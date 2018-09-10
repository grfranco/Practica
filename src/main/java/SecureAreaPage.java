import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecureAreaPage extends CommonPage {

    static final String CLASS = "class";
    static final String WELCOME_MESSAGE = "[class='subheader']";
    static final String LOGIN_SUCCESS = "[class='flash success']";

    public SecureAreaPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public String getSuccesfullMainSecureAreaPage() {
        WebElement webElement = driver.findElement(By.cssSelector(WELCOME_MESSAGE));
        return webElement.getText();
    }

    public String getSuccesfullPopUpSecureAreaPage() {
        WebElement webElement = driver.findElement(By.cssSelector(LOGIN_SUCCESS));
        return webElement.getAttribute(CLASS);
    }
}
