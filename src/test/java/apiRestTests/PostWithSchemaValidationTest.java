package apiRestTests;

import base.BaseApiTest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class PostWithSchemaValidationTest extends BaseApiTest {

    File file;

    @Test
    public void postWithSchemaValidationTest(){
        file = new File("resources/jsonPayloads/registerUser.json");
        given().
                contentType(ContentType.JSON).
                body(file).
        when().
                post(baseReqres + "/register").
        then().
                assertThat().body(matchesJsonSchemaInClasspath("schemas/registerUserResponseSchema.json")).
                and().statusCode(200).log().body();
    }
}
