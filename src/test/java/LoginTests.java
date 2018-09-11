import org.junit.Assert;
import org.junit.Test;
import testConfig.BaseChromeTest;

public class LoginTests extends BaseChromeTest {

    static final String USER_NAME = "tomsmith";
    static final String USER_PASSWORD = "SuperSecretPassword!";
    static final String USER_NOT_REGISTERED_NAME = "guillermorodriguez";
    static final String SUCCESFULL_MAIN_TEXT_SECURE_AREA_PAGE = "Welcome to the Secure Area. When you are done click logout below.";
    static final String SUCCESFULL_POP_UP_SECURE_AREA_PAGE = "flash success";
    static final String ERROR_POP_UP_LOGIN_PAGE = "flash error";

    LoginPage loginPage = new LoginPage(driver, wait);

    @Test
    public void LoginHappyPathTest() {

        SecureAreaPage secureAreaPage = new SecureAreaPage(driver, wait);

        loginPage.load();
        loginPage.login(USER_NAME, USER_PASSWORD);

        Assert.assertEquals(SUCCESFULL_MAIN_TEXT_SECURE_AREA_PAGE, secureAreaPage.getSuccesfullMainSecureAreaPage());
        Assert.assertEquals(SUCCESFULL_POP_UP_SECURE_AREA_PAGE, secureAreaPage.getSuccesfullPopUpSecureAreaPage());
    }

    @Test
    public void LoginFailNotRegisteredUserTest() {

        loginPage.load();
        loginPage.login(USER_NOT_REGISTERED_NAME, USER_PASSWORD);

        Assert.assertEquals(ERROR_POP_UP_LOGIN_PAGE, loginPage.getErrorPopUpLoginPage());
    }
}