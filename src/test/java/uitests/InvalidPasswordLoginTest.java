package uitests;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class InvalidPasswordLoginTest extends BaseTest {

    @Test
    public void invalidPasswordLoginTest(){
        loginPage.loginUser("Admin","admin12345");
        assertTrue(loginPage.getErrorMessage().toLowerCase().contains("invalid credentials"));
    }
}
