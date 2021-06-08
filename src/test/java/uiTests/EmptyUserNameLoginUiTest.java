package uiTests;

import base.BaseUiTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class EmptyUserNameLoginUiTest extends BaseUiTest {

    @Test
    public void emptyPasswordLoginTest(){
        loginPage.loginUser("","admin123");
        assertTrue(loginPage.getErrorMessage().toLowerCase().contains("username cannot be empty"));
    }
}
