package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectUtils {
    WebDriver driver;
    Select selectElement;

    public SelectUtils (WebDriver driver){
        this.driver = driver;
    }

    public void selectByVisibleText(By element, String text){
        selectElement = new Select(driver.findElement(element));
        selectElement.selectByVisibleText(text);
    }


}
