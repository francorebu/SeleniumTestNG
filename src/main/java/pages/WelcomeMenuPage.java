package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomeMenuPage {
    WebDriver driver;

    By about   = By.id("aboutDisplayLink");
    By support = By.xpath("//*[contains(@href,'support')]");
    By logout  = By.xpath("//*[contains(@href,'logout')]");

    public WelcomeMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnAbout(){
        driver.findElement(about).click();
    }

    public void clickOnSupport() throws Throwable {
        try {
            driver.findElement(support).click();
        }catch(Exception e) {
            throw new Exception("Click on support Error");
        }
    }

    public void clickOnLogout(){
        driver.findElement(logout).click();
    }

}
