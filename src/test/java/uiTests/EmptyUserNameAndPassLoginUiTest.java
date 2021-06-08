package uiTests;

import base.BaseUiTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class EmptyUserNameAndPassLoginUiTest extends BaseUiTest {

    @Test
    public void EmptyUserNameAndPassLoginTest(){
        loginPage.loginUser("","");
        assertTrue(loginPage.getErrorMessage().toLowerCase().contains("username cannot be empty"));
    }
}
