package uiTests;
import base.BaseUiTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SearchPersonUiTest extends BaseUiTest {

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
