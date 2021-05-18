package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.JavaScript;
import utils.Wait;

public class LoginPage {
    WebDriver driver;
    Wait wait;
    JavaScript js;

    private By userName       = By.xpath("//*[@id='txtUsername']");
    private By password       = By.name("txtPassword");
    private By loginButton    = By.id("btnLogin");
    private By forgotPassword = By.xpath("//*[contains(@href,'PasswordReset')]");
    private By errorMessage   = By.id("spanMessage");

    public LoginPage (WebDriver driver){
        this.driver = driver;
        this.wait= new Wait(driver);
        this.js = new JavaScript(driver);
    }

    public void loginUser(String user, String pass){
        this.enterUserName(user);
        this.enterPassword(pass);
        this.clickOnLogin();
    }

    public void enterUserName(String username){
        js.waitForPageLoad();
        driver.findElement(userName).sendKeys(username);
    }

    public void enterPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public void clickOnLogin(){
        driver.findElement(loginButton).click();
    }

    public void clickOnForgotPass(){
        driver.findElement(forgotPassword).click();
    }

    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }

    public boolean userNameAppears(){
        return driver.findElement(userName).isDisplayed();
    }
}
