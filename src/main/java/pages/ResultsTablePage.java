package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.JavaScript;

import java.util.List;

public class ResultsTablePage {
    WebDriver driver;
    JavaScript js;

    private By tableRows    = By.xpath("//*[@id='resultTable']//ul");

    public ResultsTablePage(WebDriver driver){
        this.driver = driver;
        this.js     = new JavaScript(driver);
    }

    public int getRowNum(){
        js.waitForPageLoad();
        return  driver.findElements(tableRows).size();
    }

    public String getFirstResultName(){
        js.waitForPageLoad();
        List <WebElement> results = driver.findElements(tableRows);
        return results.get(0).findElement(By.xpath("//li/b")).getText();
    }
}
