package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Wait;

public class SupportPage {
    WebDriver driver;
    private Wait wait;

    private By helpPotalButton= By.xpath("//*[@Value='Help Portal']");

    public SupportPage(WebDriver driver){
        this.driver = driver;
        this.wait = new Wait(driver);
    }

    public boolean isHelpPortalVisible(){
        return wait.forElementVisible(helpPotalButton);
    }
}
