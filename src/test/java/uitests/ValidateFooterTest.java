package uitests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateFooterTest extends BaseTest {

    @Test
    public void validateFooterTest(){
        loginPage.loginUser("Admin","admin123");
        mainMenuPage.manageUsers();
        Assert.assertTrue(footerPage.verifyFooterIsVisible());
    }
}
