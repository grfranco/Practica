import org.junit.Assert;
import org.junit.Test;
import testConfig.BaseChromeTest;

public class LoginTests extends BaseChromeTest {

    static final String SUCCESFULL_MAIN_TEXT_SECURE_AREA_PAGE = "Welcome to the Secure Area. When you are done click logout below.";
    static final String SUCCESFULL_POP_UP_SECURE_AREA_PAGE = "flash success";

    @Test
    public void LoginHappyPath() {

        LoginPage loginPage = new LoginPage(driver, wait);
        SecureAreaPage secureAreaPage = new SecureAreaPage(driver, wait);

        loginPage.load();
        loginPage.login();

        Assert.assertEquals(SUCCESFULL_MAIN_TEXT_SECURE_AREA_PAGE, secureAreaPage.getSuccesfullMainSecureAreaPage());
        Assert.assertEquals(SUCCESFULL_POP_UP_SECURE_AREA_PAGE, secureAreaPage.getSuccesfullPopUpSecureAreaPage());
    }
}