package uitests;

import base.BaseUiTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class ValidCredentialsLoginUiTest extends BaseUiTest {

    @Test
    public void validCredentialsLoginTest(){
        loginPage.loginUser("Admin","admin123");
        assertTrue(brandingPage.getWelcomeText().contains("Welcome"));
        brandingPage.clickOnUser();
    }
}
