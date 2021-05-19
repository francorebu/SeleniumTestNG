package apiTests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class PostRegisterUserfromPayloadTest {

    File file;
    String payload;

    @Test
    public void postRegisterUserfromPayload(){
        file = new File("resources/Payloads/registerUser.json");
        given().
                contentType(ContentType.JSON).
                body(file).
        when().
                post("https://reqres.in/api/register").
        then().
                assertThat().body(matchesJsonSchemaInClasspath("schemas/resgisterUserResponseSchema.json")).
                and().statusCode(200).log().body();
    }
}
