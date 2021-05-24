package apiTests;

import base.BaseApiTest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import pojos.Registration;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class PostWithPojoSerializationTest extends BaseApiTest {
    private Registration registration;

    public PostWithPojoSerializationTest(){
        registration = new Registration();
    }

    @Test
    public void postRegisterUserfromPojo(){
        registration.setEmail("eve.holt@reqres.in");
        registration.setPassword("pistol");

        given().
                contentType(ContentType.JSON).
                body(registration).log().body().
        when().
                post(baseReqres + "/register").
        then().
                assertThat().body(matchesJsonSchemaInClasspath("schemas/registerUserResponseSchema.json")).
                and().statusCode(200).log().all();
    }

}
