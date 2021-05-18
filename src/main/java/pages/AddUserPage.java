package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import utils.JavaScript;
import utils.SelectUtils;
import utils.Wait;

public class AddUserPage {
    WebDriver driver;
    SelectUtils selectUtils;
    JavaScript js;
    Wait wait;

    private By userRole        = By.id("systemUser_userType");
    private By employeeName    = By.id("systemUser_employeeName_empName");
    private By userName        = By.id("systemUser_userName");
    private By status          = By.id("systemUser_status");
    private By password        = By.id("systemUser_password");
    private By confirmPassword = By.id("systemUser_confirmPassword");
    private By saveButton      = By.id("btnSave");

    public AddUserPage(WebDriver driver){
        this.driver      = driver;
        this.selectUtils = new SelectUtils(driver);
        this.js          = new JavaScript(driver);
        this.wait        = new Wait(driver);
    }

    public void enterUserInfo(String role, String empName,String userName,String status, String pass, String confPass){
        selectUserType(role);
        enterEmployeeName(empName);
        enterUserName(userName);
        selectStatus(status);
        enterPassword(pass);
        enterConfirmPassword(confPass);
        clickOnSaveButton();
    }

    public void selectUserType(String type){
        wait.forElementVisible(userRole);
        selectUtils.selectByVisibleText(userRole,type);
    }

    public void enterEmployeeName(String name){
        driver.findElement(employeeName).sendKeys(name);
    }

    public void enterUserName(String username){
        driver.findElement(userName).sendKeys(username);
    }

    public void selectStatus(String userStatus){
        selectUtils.selectByVisibleText(status,userStatus);
    }

    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void enterConfirmPassword(String confPass){
        driver.findElement(confirmPassword).sendKeys(confPass);
    }

    public void clickOnSaveButton(){
        driver.findElement(saveButton).click();
    }

}
