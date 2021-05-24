package apiTests;
import base.BaseApiTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetWithSimpleHamMatchersTest extends BaseApiTest {

    @Test
    public void getZippoPlace_statusCode() {
                when().
                     get(baseZippo + "/us/90210").
                then().
                     assertThat().statusCode(200);
    }

    @Test
    public void getZippoPlace_size1() {
        when().
                get(baseZippo + "/us/90210").
                then().
                assertThat().body("places.'place name'", hasSize(1)).log().body();
    }

    @Test
    public void getZippoPlace_hasItem() {
        when().
                get(baseZippo + "/us/90210").
                then().
                assertThat().body("places.'place name'", hasItem("Beverly Hills"));
    }
}