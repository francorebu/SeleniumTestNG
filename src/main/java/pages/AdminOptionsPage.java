package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.UiUtils;

public class AdminOptionsPage {
    WebDriver driver;
    UiUtils uiUtils;

    private By userManagement = By.id("menu_admin_UserManagement");
    private By job            = By.id("menu_admin_Job");
    private By organization   = By.id("menu_admin_Organization");
    private By qualifications = By.id("menu_admin_Qualifications");
    private By nationalities  = By.id("menu_admin_nationality");
    private By configuration  = By.id("menu_admin_Configuration");

    public AdminOptionsPage(WebDriver driver){
        this.driver  = driver;
        this.uiUtils = new UiUtils(driver);
    }

    public void  clickOnUserManagement(){
        uiUtils.waitForElementVisible(userManagement);
        driver.findElement(userManagement).click();
    }

}
