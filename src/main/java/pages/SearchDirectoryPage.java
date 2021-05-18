package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchDirectoryPage {
    WebDriver driver;

    private By name         = By.xpath("//*[contains(@id,'empName')]");
    private By searchButton = By.id("searchBtn");
    private By resetButton  = By.id("resetBtn");

    public SearchDirectoryPage(WebDriver driver){
        this.driver = driver;
    }

    public void searchPerson(String person){
        enterName(person);
        clickOnSearchButton();
    }

    public void enterName(String personName){
        driver.findElement(name).sendKeys(personName);
    }

    public void clickOnSearchButton(){
        driver.findElement(searchButton).click();
    }

    public void clickOnResetButton(){
        driver.findElement(resetButton).click();
    }
}
