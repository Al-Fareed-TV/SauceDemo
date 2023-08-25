package actions;

import org.openqa.selenium.WebDriver;

public class LauncherPage {


    public void navigateTo(WebDriver driver,String url){
        driver.get(url);
    }
}
