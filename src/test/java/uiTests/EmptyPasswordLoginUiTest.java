package uiTests;

import base.BaseUiTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class EmptyPasswordLoginUiTest extends BaseUiTest {

    @Test
    public void emptyPasswordLoginTest(){
        loginPage.loginUser("Admin","");
        assertTrue(loginPage.getErrorMessage().toLowerCase().contains("password cannot be empty"));
    }
}
