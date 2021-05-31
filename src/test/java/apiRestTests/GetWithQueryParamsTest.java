package apiRestTests;

import base.BaseApiTest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetWithQueryParamsTest extends BaseApiTest {

    @Test
    public void getWithResponseValidationTest1() {
        given().
                queryParam("page","1").
        when().
                get( baseReqres + "/users").
        then().
                assertThat().statusCode(200).
                and().contentType(ContentType.JSON).log().body();

    }

    @Test
    public void getWithResponseValidationTest2() {
        given().
                queryParam("page","2").
                when().
                get( baseReqres + "/users").
                then().
                assertThat().statusCode(200).
                and().contentType(ContentType.JSON).log().body();

    }

    @Test
    public void getWithResponseValidationTest3() {
        given().
                queryParam("page","3").
                when().
                get( baseReqres + "/users").
                then().
                assertThat().statusCode(200).
                and().contentType(ContentType.JSON).log().body();

    }
}
