package apiTests;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class PostTest {

    @Test
    public void postTest(){
       given().
            body("{\"name\": \"morpheus\",\"job\": \"leader\"}").log().body().
       when().
            post("https://reqres.in/api/users").
       then().
            assertThat().statusCode(201).log().all().and().contentType(ContentType.JSON);
    }
}
