package uitests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateUserTest extends BaseTest {

    @Test
    public void createUser(){
        String randomUser= "Peter" + tUtils.getUniqueValue();
        loginPage.loginUser("Admin","admin123");
        mainMenuPage.manageUsers();
        customerList.clickOnAddButton();
        addUserPage.enterUserInfo("ESS","Peter Mac Anderson",randomUser,"Enabled", "12345678", "12345678");
        systemUsers.searchUser(randomUser);
        Assert.assertEquals(customerList.getFirstResultText(),randomUser);
    }
}
