package apiTests;

import base.BaseApiTest;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.Credentials;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;

public class PostWithPojoSerialiationTokenExtraction extends BaseApiTest {

    private Credentials credentials;
    private String token;

    public PostWithPojoSerialiationTokenExtraction(){
        credentials = new Credentials();
        credentials.setEmail("eve.holt@reqres.in");
        credentials.setPassword("cityslicka");
    }

    @Test
    public void postValidateUnsuccessfullLogin(){
        credentials.setEmail("eve.holt@reqres.in");
        credentials.setPassword("");

        given().
                contentType(ContentType.JSON).
                body(credentials).log().body().
        when().
                post(baseReqres + "/login").
        then().
                assertThat().statusCode(400).log().all().and().
                body("error", equalTo("Missing password"));

    }

    @Test
    public void postValidateSessionToken(){
        Assert.assertTrue(getLoginToken().length() >= 10);
    }

    public String  getLoginToken(){

        token=
        given().
                contentType(ContentType.JSON).
                body(credentials).log().body().
        when().
                post(baseReqres + "/login").
        then().
                assertThat().statusCode(200).log().all().extract().path("token");
        return token;
    }


}
