package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class UiUtils {

    WebDriver driver;
    WebDriverWait wait;
    WebElement elem;
    List <WebElement> elements;
    int numberOfElements;

    public UiUtils(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 15);
    }

    public boolean elementExist(By element){
        boolean exist = false;
        try{
            numberOfElements = driver.findElements(element).size();
            if(numberOfElements>=1){
                exist = true;
            }
        }catch (Exception e){
            exist = false;
        }
        return exist;
    }

    public boolean waitForElementVisible(By element){
        try {
            elem = wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public boolean waitForElementClickable(By element){
        try {
            elem = wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch(Exception e){
            return false;
        }
    }

    public void waitForElementPresent(By element){
        elem = wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public boolean WaitForElementNotVisible(By element){
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
