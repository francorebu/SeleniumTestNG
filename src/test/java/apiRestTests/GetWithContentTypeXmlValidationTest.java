package apiRestTests;

import base.BaseApiTest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetWithContentTypeXmlValidationTest extends BaseApiTest {

    @Test
    public void getWithContentTypeXmlValidationTest(){
        given().
                accept(ContentType.XML).
        when().
                get(basePetStore + "/pet/1").
        then().
                assertThat().statusCode(200).log().body().
                and().contentType(ContentType.XML);
    }
}
