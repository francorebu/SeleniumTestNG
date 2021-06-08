package uiTests;

import base.BaseUiTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUserUiTest extends BaseUiTest {
    String randomUser;
    String employeeName;

    @Test
    public void createUserTest(){
        randomUser = "Rebecca" + timeUtils.getUniqueValue();
        loginPage.loginUser("Admin","admin123");
        mainMenuPage.manageUsers();
        employeeName = customerList.getFirstEmployeeName();
        customerList.clickOnAddButton();
        addUserPage.enterUserInfo("ESS",employeeName,randomUser,"Enabled", "12345678", "12345678");
        systemUsers.searchUser(randomUser);
        Assert.assertEquals(customerList.getFirstUserName(),randomUser);
    }
}
