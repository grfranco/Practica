import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class loginExerciseTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
       // Driver inicializar!!!

        driver.get("http://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.waitPageLoaded();
        loginPage.login();

        /*
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");

        WebElement submit = driver.findElement(By.cssSelector("[class='radius']"));
        submit.click();

        WebDriverWait waitting = new WebDriverWait(driver, 10);

        WebElement logout = waitting.until(ExpectedConditions.presenceOfElementLocated(By.className("Logout")));
        logout.click();
*/
        driver.close();
    }
}