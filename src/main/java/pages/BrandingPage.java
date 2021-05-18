package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.JavaScript;
import utils.Wait;

public class BrandingPage {
    WebDriver driver;
    Wait wait;
    JavaScript js;

    private By welcomeUser = By.id("welcome");

    public BrandingPage(WebDriver driver){
        this.driver = driver ;
        this.wait = new Wait(driver);
        this.js = new JavaScript(driver);
    }

    public String getWelcomeText() {
        js.waitForPageLoad();
        return driver.findElement(welcomeUser).getText();
    }

    public void clickOnUser(){
        driver.findElement(welcomeUser).click();
    }

}
