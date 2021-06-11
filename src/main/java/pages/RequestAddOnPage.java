package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.UiUtils;

public class RequestAddOnPage {
    WebDriver driver;
    UiUtils uiUtils;

    By emaiInput          = By.xpath("//*[@id='email']");
    By contactNumber      = By.cssSelector("#frmBuyNow #contactNumber");
    By contactNumberError = By.xpath("//*[@id='contactNumber']/following-sibling::*");
    By organization       = By.cssSelector("#frmBuyNow #organization");
    By okButton           = By.xpath("//*[@class='modal hide in']//*[@value='Ok']");

    public RequestAddOnPage(WebDriver driver){
        this.driver  = driver;
        this.uiUtils = new UiUtils(driver);
    }

    public void enterEmail(String eMail){
        uiUtils.waitForElementVisible(emaiInput);
        driver.findElement(emaiInput).sendKeys(eMail);
    }

    public void enterContactNumber(String number){
        driver.findElement(contactNumber).sendKeys(number);
    }

    public void enterEmailAndNumber(String eMail,String number){
        this.enterEmail(eMail);
        this.enterContactNumber(number);
    }

    public String getContactNumberErrorText(){
        return driver.findElement(contactNumberError).getText();
    }


}
