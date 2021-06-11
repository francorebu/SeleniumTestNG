package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.UiUtils;

public class AddOnsPage {
    WebDriver driver;
    UiUtils uiUtils;

    By ldapRequestButton = By.xpath("(//*[text()='LDAP']/following::input[@type='button'])[1]");
    By togglIntegButton  = By.xpath("(//*[contains(text(),'with Toggl')]/following::input[@type='button'])[1]");
    By corportateButton  = By.xpath("(//*[contains(text(),'Corporate')]/following::input[@type='button'])[1]");
    By claimButton       = By.xpath("(//*[contains(text(),'Claim')]/following::input[@type='button'])[1]");

    public AddOnsPage(WebDriver driver){
        this.driver = driver;
        this.uiUtils = new UiUtils(driver);
    }

    public void clickOnLdapRequestButton(){
        uiUtils.waitForElementVisible(ldapRequestButton);
        driver.findElement(ldapRequestButton).click();
    }

    public void clickOnTogglIntegButton(){
        driver.findElement(togglIntegButton).click();
    }

    public void clickOnCorportateButton(){
        driver.findElement(corportateButton).click();
    }

    public void clickOn(){
        driver.findElement(claimButton).click();
    }

}
