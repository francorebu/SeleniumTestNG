package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Actionutils;
import utils.UiUtils;

public class UserManagementOptionsPage {
    WebDriver driver;
    Actionutils actionUtils;
    UiUtils uiUtils;

    By users = By.id("menu_admin_viewSystemUsers");

    public UserManagementOptionsPage(WebDriver driver){
        this.driver = driver;
        this.actionUtils = new Actionutils(driver);
        this.uiUtils     = new UiUtils(driver);
    }

    public void selectUsers(){
        moveToUsers();
        clickOnUsers();
    }

    public void moveToUsers(){
        uiUtils.waitForElementClickable(users);
        actionUtils.hoverOverElement(users);
    }

    public void clickOnUsers(){
        uiUtils.waitForElementVisible(users);
        driver.findElement(users).click();
    }

}
