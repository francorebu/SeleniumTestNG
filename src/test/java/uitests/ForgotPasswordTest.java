package uitests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void forgotPasswordTest(){
        loginPage.clickOnForgotPass();
        String title = resetPasswordPage.getResetButtonText();
        String expectedTitle = "Reset Password";
        Assert.assertEquals(title,expectedTitle);
    }
}
