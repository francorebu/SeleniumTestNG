package uitests;
import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SearchPersonTest extends BaseTest {

    @Test
    public void searchPerson(){
        loginPage.loginUser("Admin","admin123");
        mainMenuPage.manageUsers();
        String employeeName = customerList.getFirstEmployeeName();
        mainMenuPage.clickOnDirectory();
        searchDirectoryPage.searchPerson(employeeName);
        assertEquals(resultsTablePage.getFirstResultName(), employeeName);
    }
}
