package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.JavaScript;

import java.util.List;

public class CustomerList {
    WebDriver driver;
    JavaScript js;

    private By addButton = By.id("btnAdd");
    private By result  = By.xpath("//*[@id='resultTable']//tbody");

    public CustomerList(WebDriver driver){
        this.driver = driver;
        js = new JavaScript(driver);
    }

    public void clickOnAddButton(){
        js.waitForPageLoad();
        driver.findElement(addButton).click();
    }

    public String getFirstResultText() {
        js.waitForPageLoad();
        List<WebElement> results = driver.findElements(result);
        return results.get(0).findElement(By.xpath("//td/a")).getText();
    }

}
