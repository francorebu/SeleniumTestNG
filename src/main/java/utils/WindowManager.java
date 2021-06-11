package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;

public class WindowManager {

    private WebDriver driver;
    private Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goforward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void open(String url){
        navigate.to(url);
    }

}
