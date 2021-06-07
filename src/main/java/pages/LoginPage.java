package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.JavaScript;
import utils.UiUtils;

public class LoginPage {
    WebDriver driver;
    UiUtils uiUtils;
    JavaScript js;

    private By userName       = By.xpath("//*[@id='txtUsername']");
    private By password       = By.name("txtPassword");
    private By loginButton    = By.id("btnLogin");
    private By forgotPassword = By.xpath("//*[contains(@href,'PasswordReset')]");
    private By errorMessage   = By.id("spanMessage");

    public LoginPage (WebDriver driver){
        this.driver  = driver;
        this.uiUtils = new UiUtils(driver);
        this.js      = new JavaScript(driver);
    }

    public void loginUser(String user, String pass){
        enterUserName(user);
        enterPassword(pass);
        clickOnLogin();
    }

    public void enterUserName(String username){
        js.waitForPageLoad();
        js.setText(userName,username);
    }

    public void enterPassword(String pass){
        js.setText(password,pass);
    }

    public void clickOnLogin(){
        js.click(loginButton);
    }

    public void clickOnForgotPass(){
        driver.findElement(forgotPassword).click();
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }

    public boolean userNameAppears(){
        return uiUtils.elementExist(userName);
    }
}
