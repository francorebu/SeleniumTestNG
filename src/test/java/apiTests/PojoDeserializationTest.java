package apiTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.Location;
import static io.restassured.RestAssured.given;

public class PojoDeserializationTest {

    Location location;

    @Test
    public void getCountryInfo(){
        location=
        given().

        when().
                get("http://zippopotam.us/us/90210").as(Location.class);
        Assert.assertEquals(location.getPlaces().get(0).getPlaceName(),"Beverly Hills");
    }

}
