package pages;

import actions.LauncherPage;
import actions.PageActions;
import driver.DriverCreator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        String browser = "firefox";
        String url = "https://www.saucedemo.com/";
        WebDriver driver = new DriverCreator().createWebDriver(browser);

        try {
            LauncherPage launcherPage = new LauncherPage();
            launcherPage.navigateTo(driver,url);
            PageActions actions = new PageActions(driver);
            By userId = By.id("user-name");
            actions.type(userId,"standard_user");
            By userPassword = By.id("password");
            actions.type(userPassword,"secret_sauce");
            By submitButton = By.id("login-button");
            actions.click(submitButton);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        } finally {
            sleep(2000);
            driver.quit();
        }
    }
}
