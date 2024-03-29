package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.JavaScript;
import utils.UiUtils;

public class BrandingPage {
    WebDriver driver;
    UiUtils uiUtils;
    JavaScript js;

    By marketPlace     = By.cssSelector("#MP_link");
    By subscribeButton = By.xpath("//*[@id='Subscriber_link']");
    By questionCircle  = By.xpath("//*[contains(@class,'question-circle')]");
    By welcomeUser     = By.id("welcome");

    public BrandingPage(WebDriver driver){
        this.driver  = driver ;
        this.uiUtils = new UiUtils(driver);
        this.js      = new JavaScript(driver);
    }

    public String getWelcomeText() {
        js.waitForPageLoad();
        return driver.findElement(welcomeUser).getText();
    }

    public void clickOnMarketPlace(){
        js.waitForPageLoad();
        driver.findElement(marketPlace).click();
    }

    public void clickOnSubscribe(){
        js.waitForPageLoad();
        driver.findElement(subscribeButton).click();
    }

    public void clickOnQuestionCircle(){
        js.waitForPageLoad();
        driver.findElement(questionCircle).click();
    }

    public void clickOnUser(){
        js.waitForPageLoad();
        driver.findElement(welcomeUser).click();
    }
}
