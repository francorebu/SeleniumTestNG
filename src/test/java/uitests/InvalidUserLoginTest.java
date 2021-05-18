package uitests;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class InvalidUserLoginTest extends BaseTest {

    @Test
    public void invalidUserLoginTest(){
        loginPage.loginUser("invalidUser","admin1234");
        assertTrue(loginPage.getErrorMessage().toLowerCase().contains("invalid credentials"));
    }
}
