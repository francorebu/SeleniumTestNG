package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.UiUtils;

public class MainMenuPage {
    private UiUtils uiUtils;
    private WebDriver driver;
    private AdminOptionsPage adminOptionsPage;
    private UserManagementOptionsPage userManagementOptionsPage;

    private By admin       = By.id("menu_admin_viewAdminModule");
    private By pim         = By.id("menu_pim_viewPimModule");
    private By leave       = By.id("menu_leave_viewLeaveModule");
    private By time        = By.id("menu_time_viewTimeModule");
    private By recruitment = By.id("menu_recruitment_viewRecruitmentModule");
    private By myInfo      = By.id("menu_pim_viewMyDetails");
    private By performance = By.id("menu__Performance");
    private By dashboard   = By.id("menu_dashboard_index");
    private By directory   = By.id("menu_directory_viewDirectory");
    private By maintenance = By.id("menu_maintenance_purgeEmployee");
    private By buzz        = By.id("menu_buzz_viewBuzz");

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
