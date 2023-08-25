import driver.DriverCreator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Login;

import static java.lang.Thread.sleep;

public class LoginTest {
    String ch = "Hello";
    @Test
    public void testLogin()throws InterruptedException {
        Assert.assertEquals("Hello",ch);
    }

}
