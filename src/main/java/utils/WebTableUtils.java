package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTableUtils {

    WebDriver driver;

    public WebTableUtils(WebDriver driver){
        this.driver = driver;
    }

    public int getColumnsCount(By webTable){
        List<WebElement> columns = driver.findElement(webTable).findElements(By.xpath("//tr/th"));
        return columns.size();
    }

    public int getRowCount(By webTable){
        List<WebElement> rows = driver.findElement(webTable).findElements(By.xpath("//tbody/tr"));
        return rows.size();
    }
}
