package apiTests;

import base.BaseApiTest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetWithContentTypeValidationTest extends BaseApiTest {

    @Test
    public void getWithContentTypeValidationTest(){
        given().
                accept(ContentType.XML).
        when().
                get(basePetStore + "/pet/1").
        then().
                assertThat().statusCode(200).log().body().
                and().contentType(ContentType.XML);
    }
}
