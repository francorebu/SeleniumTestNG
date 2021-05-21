package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.JavaScript;
import utils.UiUtils;

public class BrandingPage {
    WebDriver driver;
    UiUtils uiUtils;
    JavaScript js;

    private By welcomeUser = By.id("welcome");

    public BrandingPage(WebDriver driver){
        this.driver  = driver ;
        this.uiUtils = new UiUtils(driver);
        this.js      = new JavaScript(driver);
    }

    public String getWelcomeText() {
        js.waitForPageLoad();
        return driver.findElement(welcomeUser).getText();
    }

    public void clickOnUser(){
        driver.findElement(welcomeUser).click();
    }

}
