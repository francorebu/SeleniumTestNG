package uitests;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class ValidCredentialsLoginTest extends BaseTest {

    @Test
    public void validCredentialsLoginTest(){
        loginPage.loginUser("Admin","admin123");
        assertTrue(brandingPage.getWelcomeText().contains("Welcome"));
        brandingPage.clickOnUser();
    }
}
