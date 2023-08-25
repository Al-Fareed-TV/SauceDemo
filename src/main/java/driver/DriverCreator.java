package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.sql.DriverManager;

public class DriverCreator {
    public WebDriver createWebDriver(String browser) {
        WebDriver driver;
        switch (browser){
            case "firefox" : driver = new FirefoxDriver();
            break;
            case "safari" : driver = new SafariDriver();
            break;
            case "chrome" : driver = new ChromeDriver();
            break;
            default: driver = setDefaultDriver();
        }
        return driver;
    }

    private WebDriver setDefaultDriver() {
        return new FirefoxDriver();
    }

}