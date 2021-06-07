package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScript {
    WebDriver driver;
    WebElement element;
    String script;
    JavascriptExecutor jsExecutor;

    public JavaScript(WebDriver driver){
        this.driver = driver;
        jsExecutor = (JavascriptExecutor) driver;
    }

    public boolean waitForPageLoad() {
        do{
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!getDomState().equals("complete"));

        return getDomState().equals("complete");
    }

    public String getDomState(){
        script = "return document.readyState;";
        String state = jsExecutor.executeScript(script).toString().toLowerCase();
        return state;
    }

    public void scrolltoElement(By elem){
        element = driver.findElement(elem) ;
        script = "arguments[0].scrollIntoView();";
        jsExecutor.executeScript(script,element);
    }

    public void click(By elem){
        element = driver.findElement(elem) ;
        script = "arguments[0].click();";
        jsExecutor.executeScript(script,element);
    }

    public void setText(By elem, String text){
        element = driver.findElement(elem) ;
        script = "arguments[0].value='" + text + "'";
        jsExecutor.executeScript(script,element);
    }

    public void scrollDown(){
        script = "window.scroll(0,document.body.scrollHeight)";
        jsExecutor.executeScript(script);
    }

    public void scrollUp(){
        script = "window.scroll(0,-document.body.scrollHeight)";
        jsExecutor.executeScript(script);
    }
}
