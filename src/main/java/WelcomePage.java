import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomePage extends CommonPage {

    static final String CLASS = "class";
    static final String WELCOME_MESSAGE = "[class='subheader']";
    static final String LOGIN_SUCCESS = "[class='flash success']";

    public WelcomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public String getSuccesfullLoginWelcomeText() {
        WebElement webElement = driver.findElement(By.cssSelector(WELCOME_MESSAGE));
        return webElement.getText();
    }

    public String getLoginSuccesfullText() {
        WebElement webElement = driver.findElement(By.cssSelector(LOGIN_SUCCESS));
        return webElement.getAttribute(CLASS);
    }
}
