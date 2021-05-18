package uitests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpSupportTest extends BaseTest {

    @Test
    public void helpSupportTest() throws Throwable {
        loginPage.loginUser("Admin","admin123");
        brandingPage.clickOnUser();
        welcomeMenuPage.clickOnSupport();
        Assert.assertTrue(supportPage.isHelpPortalVisible());
    }
}
