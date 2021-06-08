package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.JavaScript;

public class SystemUsers {
    WebDriver driver;
    JavaScript js;

    By userName     = By.id("searchSystemUser_userName");
    By searchButton = By.id("searchBtn");

    public SystemUsers(WebDriver driver){
        this.driver = driver;
        this.js     = new JavaScript(driver);
    }

    public void searchUser(String user){
        enterUserName(user);
        clickOnSearchButton();
    }

    public void enterUserName(String name){
        js.waitForPageLoad();
        driver.findElement(userName).sendKeys(name);
    }

    public void clickOnSearchButton(){
        driver.findElement(searchButton).click();
    }


}
