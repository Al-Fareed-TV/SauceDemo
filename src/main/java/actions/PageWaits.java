package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class PageWaits {
    private FluentWait wait ;

    public PageWaits( WebDriver driver)  {
        wait = intiWait(driver);
    }

    public WebElement waitUntilElementVisible(By by){
        return (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    private FluentWait intiWait(WebDriver driver){
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
    }

}
