package uiTests;

import base.BaseUiTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpSupportUiTest extends BaseUiTest {

    @Test
    public void helpSupportTest() throws Throwable {
        loginPage.loginUser("Admin","admin123");
        brandingPage.clickOnUser();
        welcomeMenuPage.clickOnSupport();
        Assert.assertTrue(supportPage.isHelpPortalVisible());
    }
}
