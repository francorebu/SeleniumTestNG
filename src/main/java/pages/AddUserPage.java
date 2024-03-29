package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.JavaScript;
import utils.SelectUtils;
import utils.UiUtils;

public class AddUserPage {
    WebDriver driver;
    SelectUtils selectUtils;
    JavaScript js;
    UiUtils uiUtils;

    By userRole        = By.id("systemUser_userType");
    By employeeName    = By.id("systemUser_employeeName_empName");
    By userName        = By.id("systemUser_userName");
    By status          = By.id("systemUser_status");
    By password        = By.id("systemUser_password");
    By confirmPassword = By.id("systemUser_confirmPassword");
    By saveButton      = By.id("btnSave");

    public AddUserPage(WebDriver driver){
        this.driver      = driver;
        this.selectUtils = new SelectUtils(driver);
        this.js          = new JavaScript(driver);
        this.uiUtils     = new UiUtils(driver);
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
        uiUtils.waitForElementVisible(userRole);
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
