import driver.DriverCreator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Login;

import static java.lang.Thread.sleep;

public class LoginTest {
    @Test
    public void testLogin()throws InterruptedException {
        Login login = new Login();
        login.LoginUser();
    }

}
