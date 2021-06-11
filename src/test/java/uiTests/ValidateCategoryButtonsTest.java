package uiTests;

import base.BaseUiTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ValidateCategoryButtonsTest extends BaseUiTest {

    @Test
    public void validateCategoryButtonsTest() {
        loginPage.loginUser("Admin","admin123");
        brandingPage.clickOnQuestionCircle();
        Assert.assertTrue(categoriesPage.buttonsAreVisible(),"One or more buttons are not appearing");
    }
}
