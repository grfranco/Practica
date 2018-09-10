import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageOld {

    //private WebDriver driver = new ChromeDriver();
    private ChromeDriver driver;

    static final String EXAMPLE_PAGE = "example";
    static final String USER_NAME = "username";
    static final String USER_FILL_NAME = "tomsmith";
    static final String USER_PASSWORD = "password";
    static final String USER_FILL_PASSWORD = "SuperSecretPassword!";
    static final String SUBMIT_BUTTON = "[class='radius']";


    @FindBy(id = USER_NAME)
    public WebElement username;

    @FindBy(id = USER_PASSWORD)
    public WebElement password;

    @FindBy(css = SUBMIT_BUTTON)
    public WebElement submit;

    public LoginPageOld(ChromeDriver driver) {
        this.driver = driver;
    }

    public void waitPageLoaded() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(EXAMPLE_PAGE)));
    }

    public void fillUserName() {
        //WebElement username = driver.findElement(By.id(USER_NAME));
        username.sendKeys(USER_FILL_NAME);
    }

    public void fillUserPass() {
        //WebElement password = driver.findElement(By.id(USER_PASSWORD));
        password.sendKeys(USER_FILL_PASSWORD);
    }

    public void submit() {
        //WebElement submit = driver.findElement(By.cssSelector(SUBMIT_BUTTON));
        submit.click();
    }

    public void login() {
        fillUserName();
        fillUserPass();
        submit();
    }
}
