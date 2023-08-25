package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class PageActions {
    WebDriver driver;
    public PageActions(WebDriver driver) {
        this.driver = driver;
    }

    public void click( By by){
        new PageWaits(driver).waitUntilElementVisible(by);
    }
    public void type(By by,String text){
        new PageWaits(driver).waitUntilElementVisible(by).sendKeys(text);
    }
}
