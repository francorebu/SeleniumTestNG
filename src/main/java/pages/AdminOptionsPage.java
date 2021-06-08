package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.UiUtils;

public class AdminOptionsPage {
    WebDriver driver;
    UiUtils uiUtils;

    By userManagement = By.id("menu_admin_UserManagement");
    By job            = By.id("menu_admin_Job");
    By organization   = By.id("menu_admin_Organization");
    By qualifications = By.id("menu_admin_Qualifications");
    By nationalities  = By.id("menu_admin_nationality");
    By configuration  = By.id("menu_admin_Configuration");

    public AdminOptionsPage(WebDriver driver){
        this.driver  = driver;
        this.uiUtils = new UiUtils(driver);
    }

    public void  clickOnUserManagement(){
        uiUtils.waitForElementVisible(userManagement);
        driver.findElement(userManagement).click();
    }

}
