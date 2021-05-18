package base;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;
import utils.TimeUtils;
import java.io.File;
import java.io.IOException;

public class BaseTest {
    protected WebDriver driver;
    protected TimeUtils tUtils;

    protected LoginPage loginPage;
    protected BrandingPage brandingPage;
    protected ResetPasswordPage resetPasswordPage;
    protected WelcomeMenuPage welcomeMenuPage;
    protected MainMenuPage mainMenuPage;
    protected SearchDirectoryPage searchDirectoryPage;
    protected ResultsTablePage resultsTablePage;
    protected AdminOptionsPage adminOptionsPage;
    protected UserManagementOptionsPage userManagementOptionsPage;
    protected SystemUsers systemUsers;
    protected CustomerList customerList;
    protected AddUserPage addUserPage;
    protected FooterPage footerPage;
    protected SupportPage supportPage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver(getChromeOptions());
        goToLoginPage();
        instantiatePages();
        instantiateUtils();
    }

    public void instantiatePages(){
        loginPage                 = new LoginPage(driver);
        brandingPage              = new BrandingPage(driver);
        resetPasswordPage         = new ResetPasswordPage(driver);
        welcomeMenuPage           = new WelcomeMenuPage(driver);
        mainMenuPage              = new MainMenuPage(driver);
        searchDirectoryPage       = new SearchDirectoryPage(driver);
        resultsTablePage          = new ResultsTablePage(driver);
        adminOptionsPage          = new AdminOptionsPage(driver);
        userManagementOptionsPage = new UserManagementOptionsPage(driver);
        systemUsers               = new SystemUsers(driver);
        customerList              = new CustomerList(driver);
        addUserPage               = new AddUserPage(driver);
        footerPage                = new FooterPage(driver);
        supportPage               = new SupportPage(driver);
    }

    public void instantiateUtils(){
        tUtils = new TimeUtils();
    }

    @BeforeMethod
    public void goToLoginPage(){
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    }

    @AfterMethod
    public void recordFailure(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()) {
            TakesScreenshot camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/test.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @AfterClass
    public void tearDown(){
         driver.quit();
    }

    public ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        return options;
    }
}
