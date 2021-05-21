package apiTests;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import pojos.Registration;

import java.io.File;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class PostWithPojoSerializationTest {
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
                post("https://reqres.in/api/register").
        then().
                assertThat().body(matchesJsonSchemaInClasspath("schemas/resgisterUserResponseSchema.json")).
                and().statusCode(200).log().all();
    }

}
