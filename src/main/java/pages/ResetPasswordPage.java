package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResetPasswordPage {
    WebDriver driver;

    private By resetButton = By.xpath("//*[@id='btnSearchValues']");

    public ResetPasswordPage (WebDriver driver){
        this.driver = driver;
    }

    public String getResetButtonText(){
        return driver.findElement(resetButton).getAttribute("value");
    }
}
