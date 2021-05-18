package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.JavaScript;
import utils.Wait;

public class FooterPage {
    WebDriver driver;
    private JavaScript javaScript;
    private Wait wait;

    private By footer = By.xpath("//*[@id='footer']//*[contains(@href,'orangehrm.com')]");

    public FooterPage(WebDriver driver){
        this.driver = driver;
        this.javaScript = new JavaScript(driver);
        this.wait = new Wait(driver);
    }

    public void scrollToFooter(){
        javaScript.waitForPageLoad();
        javaScript.scrolltoElement(footer);
    }

    public boolean verifyFooterIsVisible(){
        this.scrollToFooter();
        return wait.forElementVisible(footer);
    }
}
