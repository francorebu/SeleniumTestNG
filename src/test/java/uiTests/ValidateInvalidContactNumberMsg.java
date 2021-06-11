package uiTests;

import base.BaseUiTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateInvalidContactNumberMsg extends BaseUiTest {

    @Test
    public void validateInvalidContactNumberMsg() {
        loginPage.loginUser("Admin","admin123");
        brandingPage.clickOnMarketPlace();
        addOnsPage.clickOnLdapRequestButton();
        requestAddOnPage.enterEmailAndNumber("Test@gmail.com","12345678qwer");
        Assert.assertEquals(requestAddOnPage.getContactNumberErrorText(),"Enter a valid contact number",
                "Invalid Error message");
    }
}
