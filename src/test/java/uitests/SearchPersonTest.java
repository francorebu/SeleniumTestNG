package uitests;
import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SearchPersonTest extends BaseTest {

    @Test
    public void searchPerson(){
        String fullName = "Lisa Andrews";
        loginPage.loginUser("Admin","admin123");
        mainMenuPage.clickOnDirectory();
        searchDirectoryPage.searchPerson(fullName);
        assertEquals(resultsTablePage.getFirstResultName(), fullName);
    }
}
