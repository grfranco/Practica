import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void LoginHappyPath() {

        LoginPage loginPage = new LoginPage(driver, wait);

        loginPage.load();
        loginPage.login();
    }
}