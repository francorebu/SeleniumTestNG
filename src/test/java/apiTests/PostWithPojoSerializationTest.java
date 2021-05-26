package apiTests;

import base.BaseApiTest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import pojos.Credentials;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class PostWithPojoSerializationTest extends BaseApiTest {
    private Credentials credentials;

    public PostWithPojoSerializationTest(){
        credentials = new Credentials();
    }

    @Test
    public void postRegisterUserfromPojo(){
        credentials.setEmail("eve.holt@reqres.in");
        credentials.setPassword("pistol");

        given().
                contentType(ContentType.JSON).
                body(credentials).log().body().
        when().
                post(baseReqres + "/register").
        then().
                assertThat().body(matchesJsonSchemaInClasspath("schemas/registerUserResponseSchema.json")).
                and().statusCode(200).log().all();
    }

}
