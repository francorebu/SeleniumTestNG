package uiTests;
import base.BaseUiTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateFooterUiTest extends BaseUiTest {

    @Test
    public void validateFooterTest(){
        loginPage.loginUser("Admin","admin123");
        mainMenuPage.manageUsers();
        Assert.assertTrue(footerPage.verifyFooterIsVisible());
    }
}
