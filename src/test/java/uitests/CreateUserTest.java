package uitests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUserTest extends BaseTest {
    String randomUser;

    @Test
    public void createUser(){
        randomUser = "Rebecca" + tUtils.getUniqueValue();
        loginPage.loginUser("Admin","admin123");
        mainMenuPage.manageUsers();
        String employeeName = customerList.getFirstEmployeeName();
        customerList.clickOnAddButton();
        addUserPage.enterUserInfo("ESS",employeeName,randomUser,"Enabled", "12345678", "12345678");
        systemUsers.searchUser(randomUser);
        Assert.assertEquals(customerList.getFirstUserName(),randomUser);
    }
}
