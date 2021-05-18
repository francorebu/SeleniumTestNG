package uitests;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class LogOutTest extends BaseTest {

    @Test
    public void logout(){
        loginPage.loginUser("Admin","admin123");
        brandingPage.clickOnUser();
        welcomeMenuPage.clickOnLogout();
        assertTrue(loginPage.userNameAppears());
    }
}
