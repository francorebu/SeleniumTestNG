package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionutils {
    WebDriver driver;
    Actions action;

    public Actionutils(WebDriver driver){
        this.driver = driver;
        action = new Actions(driver);
    }

    public void hoverOverElement(By element){
        action.moveToElement(driver.findElement(element)).perform();
    }
}
