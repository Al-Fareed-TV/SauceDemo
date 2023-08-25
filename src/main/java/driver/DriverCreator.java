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
        return switch (browser) {
            case "firefox" -> new FirefoxDriver();
            case "safari" -> new SafariDriver();
            case "chrome" -> new ChromeDriver();
            default -> setDefaultDriver();
        };
    }

    private WebDriver setDefaultDriver() {
        return new FirefoxDriver();
    }

}