package apiTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetWithDataProviderPathParamsTest {

    @Test(dataProvider = "zipAndPlaces")
    public void getWithDataProviderPathParamsTest(String country, String zip,String place) {
        given().
                pathParam("countryCode", country).
                pathParam("zipCode", zip).
        when().
                get("http://zippopotam.us/{countryCode}/{zipCode}").
        then().
                assertThat().body("places[0].'place name'", equalTo(place)).log().all();
    }

    @DataProvider(name="zipAndPlaces")
    public static Object[][] zipCodesAndPlaces(){
        return new Object[][]{
                {"us", "90210", "Beverly Hills"},
                {"us","12345","Schenectady"},
                {"ca","B2R","Waverley"},
                {"nl","1001","Amsterdam"}
        };
    }
}
