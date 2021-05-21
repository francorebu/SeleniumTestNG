package apiTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetWithSimpleHamMatchersTest {

    @Test
    public void getZippoPlace_statusCode() {
                when().
                     get("http://zippopotam.us/us/90210").
                then().
                     assertThat().statusCode(200);
    }

    @Test
    public void getZippoPlace_size1() {
        when().
                get("http://zippopotam.us/us/90210").
                then().
                assertThat().body("places.'place name'", hasSize(1)).log().body();
    }

    @Test
    public void getZippoPlace_hasItem() {
        when().
                get("http://zippopotam.us/us/90210").
                then().
                assertThat().body("places.'place name'", hasItem("Beverly Hills"));
    }
}