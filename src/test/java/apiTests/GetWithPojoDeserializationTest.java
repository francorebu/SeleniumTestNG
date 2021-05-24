package apiTests;
import base.BaseApiTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.Location;
import static io.restassured.RestAssured.given;

public class GetWithPojoDeserializationTest extends BaseApiTest {

    Location location;

    @Test
    public void getCountryInfo(){
        location=
        given().
        when().
                get(baseZippo + "/us/90210").as(Location.class);
        Assert.assertEquals(location.getPlaces().get(0).getPlaceName(),"Beverly Hills");
    }

}
