package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.UiUtils;

public class MainMenuPage {
     UiUtils uiUtils;
     WebDriver driver;
     AdminOptionsPage adminOptionsPage;
     UserManagementOptionsPage userManagementOptionsPage;

     By admin       = By.id("menu_admin_viewAdminModule");
     By pim         = By.id("menu_pim_viewPimModule");
     By leave       = By.id("menu_leave_viewLeaveModule");
     By time        = By.id("menu_time_viewTimeModule");
     By recruitment = By.id("menu_recruitment_viewRecruitmentModule");
     By myInfo      = By.id("menu_pim_viewMyDetails");
     By performance = By.id("menu__Performance");
     By dashboard   = By.id("menu_dashboard_index");
     By directory   = By.id("menu_directory_viewDirectory");
     By maintenance = By.id("menu_maintenance_purgeEmployee");
     By buzz        = By.id("menu_buzz_viewBuzz");

    public MainMenuPage(WebDriver driver){
        this.driver                    = driver;
        this.adminOptionsPage          = new AdminOptionsPage(driver);
        this.userManagementOptionsPage = new UserManagementOptionsPage(driver);
        this.uiUtils                   = new UiUtils(driver);
    }

    public void manageUsers() {
        this.clickOnAdmin();
        adminOptionsPage.clickOnUserManagement();
        userManagementOptionsPage.selectUsers();
    }

    public void clickOnAdmin(){
        uiUtils.waitForElementVisible(admin);
        driver.findElement(admin).click();
    }

    public void clickOnPim(){
        driver.findElement(pim).click();
    }

    public void clickOnLeave(){
        driver.findElement(leave).click();
    }

    public void clickOnTime(){
        driver.findElement(time).click();
    }

    public void clickOnRecruitment(){
        driver.findElement(recruitment).click();
    }

    public void clickOnMyInfo(){
        driver.findElement(myInfo).click();
    }

    public void clickOnPerformance(){
        driver.findElement(performance).click();
    }

    public void clickOnDashboard(){
        driver.findElement(dashboard).click();
    }

    public void clickOnDirectory(){
        driver.findElement(directory).click();
    }

    public void clickOnMaintenance(){
        driver.findElement(maintenance).click();
    }

    public void clickOnBuzz(){
        driver.findElement(buzz).click();
    }
}
