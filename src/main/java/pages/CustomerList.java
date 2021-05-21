package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.JavaScript;
import utils.WebTableUtils;

import java.util.List;

public class CustomerList {
    WebDriver driver;
    JavaScript js;
    WebTableUtils webTableUtils;

    private By addButton     = By.id("btnAdd");
    private By resultsTable  = By.xpath("//*[@id='resultTable']");
    private By userNames     = By.xpath("//td/a");
    private By employeeNames = By.xpath("//tr/td[4]");

    public CustomerList(WebDriver driver){
        this.driver        = driver;
        this.js            = new JavaScript(driver);
        this.webTableUtils = new WebTableUtils(driver);
    }

    public void clickOnAddButton(){
        js.waitForPageLoad();
        System.out.println("Rows num is : " + webTableUtils.getRowCount(resultsTable));
        driver.findElement(addButton).click();
    }

    public String getFirstUserName() {
        js.waitForPageLoad();
        List <WebElement> userNames = driver.findElements(this.userNames);
        return userNames.get(0).getText();
    }

    public String getFirstEmployeeName() {
        js.waitForPageLoad();
        List <WebElement> employeNames = driver.findElements(employeeNames);
        return employeNames.get(0).getText();
    }

}
