package apiTests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class ContentTypeTest {

    @Test
    public void contentTypetest(){
        given().
                accept(ContentType.XML).
        when().
                get("https://petstore.swagger.io/v2/pet/1").
        then().
                assertThat().statusCode(200).log().body().and().contentType(ContentType.XML);
    }
}
