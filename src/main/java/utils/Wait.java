package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Wait {

    WebDriver driver;
    WebDriverWait wait;

    WebElement elem;
    List <WebElement> elements;

    public Wait(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 15);
    }

    public boolean forElementVisible(By element){
        try {
            elem = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public void forElementPresent(By element){
        elem = wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public boolean forElementNotVisible(By element){
        try{
            wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public List <WebElement> forElementNotPresent(By element){
        return elements = wait.until(ExpectedConditions.numberOfElementsToBe(element,0));
    }
}
