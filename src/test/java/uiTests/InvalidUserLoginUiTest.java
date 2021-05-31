package uiTests;

import base.BaseUiTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class InvalidUserLoginUiTest extends BaseUiTest {

    @Test
    public void invalidUserLoginTest(){
        loginPage.loginUser("invalidUser","admin1234");
        assertTrue(loginPage.getErrorMessage().toLowerCase().contains("invalid credentials"));
    }
}
