import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends CommonPage {

    static final String LOGIN_PAGE_URL = "http://the-internet.herokuapp.com/login";
    static final String USER_NAME = "username";
    static final String USER_FILL_NAME = "tomsmith";
    static final String USER_PASSWORD = "password";
    static final String USER_FILL_PASSWORD = "SuperSecretPassword!";
    static final String SUBMIT_BUTTON = "[class='radius']";

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void load() {
        driver.get(LOGIN_PAGE_URL);
        waitPageLoginLoaded();
    }

    public void login() {
        fillUserName();
        fillUserPass();
        submit();
    }

    private void fillUserName() {
        this.fillText(By.id(USER_NAME), USER_FILL_NAME);
    }

    private void fillUserPass() {
        this.fillText(By.id(USER_PASSWORD), USER_FILL_PASSWORD);
    }

    private void submit() {
        this.click(By.cssSelector(SUBMIT_BUTTON));
    }

    private void waitPageLoginLoaded() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(USER_NAME)));
    }
}