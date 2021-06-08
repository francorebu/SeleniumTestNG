package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.JavaScript;
import utils.UiUtils;

import java.util.ArrayList;

public class HeroPage {
    WebDriver driver;
    UiUtils uiUtils;
    JavaScript javaScript;
    ArrayList<String> tabs;

    By searchInput = By.xpath("//*[@id='query']");

    public HeroPage(WebDriver driver){
        this.driver = driver;
        this.uiUtils = new UiUtils(driver);
        this.javaScript = new JavaScript(driver);
    }

    public void switchToTab(){
        tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        uiUtils.waitForElementVisible(searchInput);
    }

    public boolean searchAppears(){
        this.switchToTab();
        return uiUtils.elementExist(searchInput);
    }
}
