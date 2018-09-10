import org.junit.Assert;
import org.junit.Test;
import testConfig.BaseChromeTest;

public class LoginTests extends BaseChromeTest {

    static final String WELCOME_TO_THE_PAGE = "Welcome to the Secure Area. When you are done click logout below.";
    static final String FLASH_SUCCESS = "flash success";

    @Test
    public void LoginHappyPath() {

        LoginPage loginPage = new LoginPage(driver, wait);
        WelcomePage welcomePage = new WelcomePage(driver, wait);

        loginPage.load();
        loginPage.login();

        Assert.assertEquals(WELCOME_TO_THE_PAGE, welcomePage.getSuccesfullLoginWelcomeText());
        Assert.assertEquals(FLASH_SUCCESS, welcomePage.getLoginSuccesfullText());
    }
}