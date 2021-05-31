package uiTests;

import base.BaseUiTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class LogOutUiTest extends BaseUiTest {

    @Test
    public void logout(){
        loginPage.loginUser("Admin","admin123");
        brandingPage.clickOnUser();
        welcomeMenuPage.clickOnLogout();
        assertTrue(loginPage.userNameAppears());
    }
}
