package apiRestTests;
import base.BaseApiTest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PostWithStringBodyTest extends BaseApiTest {

    @Test
    public void postWithStringBodyTest (){
       given().
            body("{\"name\": \"morpheus\",\"job\": \"leader\"}").log().body().
       when().
            post(baseReqres + "/users").
       then().
            assertThat().statusCode(201).log().all().and().contentType(ContentType.JSON);
    }
}
