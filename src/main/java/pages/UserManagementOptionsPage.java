package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Actionutils;
import utils.Wait;

public class UserManagementOptionsPage {
    WebDriver driver;
    Actionutils actionUtils;
    Wait wait;

    private By users = By.id("menu_admin_viewSystemUsers");

    public UserManagementOptionsPage(WebDriver driver){
        this.driver = driver;
        this.actionUtils = new Actionutils(driver);
        this.wait = new Wait(driver);
    }

    public void selectUsers(){
        moveToUsers();
        clickOnUsers();
    }

    public void moveToUsers(){
        wait.forElementVisible(users);
        actionUtils.hoverOverElement(users);
    }

    public void clickOnUsers(){
        wait.forElementVisible(users);
        driver.findElement(users).click();
    }

}
