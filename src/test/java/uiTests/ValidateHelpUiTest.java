package uiTests;

import base.BaseUiTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateHelpUiTest extends BaseUiTest {

    @Test
    public void helpSupportTest() {
        loginPage.loginUser("Admin","admin123");
        brandingPage.clickOnQuestionCircle();
        Assert.assertTrue(heroPage.searchAppears());
    }
}
