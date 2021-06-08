package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.UiUtils;

public class SupportPage {
    WebDriver driver;
    UiUtils uiUtils;

    By helpPotalButton= By.xpath("//*[@Value='Help Portal']");

    public SupportPage(WebDriver driver){
        this.driver  = driver;
        this.uiUtils = new UiUtils(driver);
    }

    public boolean isHelpPortalVisible(){
        return uiUtils.waitForElementVisible(helpPotalButton);
    }
}
