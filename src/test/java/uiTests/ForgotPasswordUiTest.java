package uiTests;

import base.BaseUiTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordUiTest extends BaseUiTest {

    @Test
    public void forgotPasswordTest(){
        loginPage.clickOnForgotPass();
        String title = resetPasswordPage.getResetButtonText();
        String expectedTitle = "Reset Password";
        Assert.assertEquals(title,expectedTitle);
    }
}
