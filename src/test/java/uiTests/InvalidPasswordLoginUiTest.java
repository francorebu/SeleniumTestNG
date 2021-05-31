package uiTests;

import base.BaseUiTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class InvalidPasswordLoginUiTest extends BaseUiTest {

    @Test
    public void invalidPasswordLoginTest(){
        loginPage.loginUser("Admin","admin12345");
        assertTrue(loginPage.getErrorMessage().toLowerCase().contains("invalid credentials"));
    }
}
