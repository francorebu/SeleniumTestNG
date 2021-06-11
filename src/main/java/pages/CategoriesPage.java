package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.JavaScript;

import java.util.ArrayList;

public class CategoriesPage {
    WebDriver driver;
    JavaScript javaScript;
    ArrayList<String> tabs;

    By adminGuideButton    = By.xpath("//*[text()='Admin User Guide']");
    By employeeGuideButton = By.xpath("//*[text()='Employee User Guide']");
    By faqsButton          = By.xpath("//*[text()='FAQs']");
    By mobileAppButton     = By.xpath("//*[text()='Mobile App']");

    public CategoriesPage(WebDriver driver){
        this.driver     = driver;
        this.javaScript = new JavaScript(driver);
    }

    public void switchTotab(){
        tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        javaScript.waitForPageLoad();
    }

    public boolean buttonsAreVisible(){
        try{
            this.switchTotab();
            this.allButtonsDisplayed();
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public void allButtonsDisplayed(){
        driver.findElement(adminGuideButton).isDisplayed();
        driver.findElement(employeeGuideButton).isDisplayed();
        driver.findElement(faqsButton).isDisplayed();
        driver.findElement(mobileAppButton).isDisplayed();
    }

    public void clickOnAdminGuide(){
        this.switchTotab();
        driver.findElement(adminGuideButton).click();
    }

    public void clickOnEmployeeGuide(){
        this.switchTotab();
        driver.findElement(employeeGuideButton).click();
    }

    public void clickOnFaqs(){
        this.switchTotab();
        driver.findElement(faqsButton).click();
    }

    public void clickOnMobileApp(){
        this.switchTotab();
        driver.findElement(mobileAppButton).click();
    }

}
