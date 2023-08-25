package driver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import io.github.bonigarcia.wdm.managers.SafariDriverManager;
import org.openqa.selenium.WebDriver;

public class DriverCreator {
    public WebDriver createWebDriver(String browser){
        return switch (browser) {
            case "chrome" -> new ChromeDriverManager().create();
            case "safari" -> new SafariDriverManager().create();
            case "firefox" -> new FirefoxDriverManager().create();
            default -> new ChromeDriverManager().create();
        };
    }
}
