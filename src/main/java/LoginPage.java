import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends CommonPage {

    static final String LOGIN_PAGE_URL = "http://the-internet.herokuapp.com/login";
    static final String USER_NAME = "username";
    static final String USER_PASSWORD = "password";
    static final String SUBMIT_BUTTON = "[class='radius']";
    static final String CLASS = "class";
    static final String LOGIN_ERROR = "[class='flash error']";

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void load() {
        driver.get(LOGIN_PAGE_URL);
        waitPageLoginLoaded();
    }

    public void login(String username, String user_password) {
        fillUserName(username);
        fillUserPass(user_password);
        submit();
    }

    public String getErrorPopUpLoginPage() {
        WebElement webElement = driver.findElement(By.cssSelector(LOGIN_ERROR));
        return webElement.getAttribute(CLASS);
    }

    private void fillUserName(String username) {
        this.fillText(By.id(USER_NAME), username);
    }

    private void fillUserPass(String user_password) {
        this.fillText(By.id(USER_PASSWORD), user_password);
    }

    private void submit() {
        this.click(By.cssSelector(SUBMIT_BUTTON));
    }

    private void waitPageLoginLoaded() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(USER_NAME)));
    }
}