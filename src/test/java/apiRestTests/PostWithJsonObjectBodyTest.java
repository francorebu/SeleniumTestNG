package apiRestTests;

import base.BaseApiTest;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostWithJsonObjectBodyTest extends BaseApiTest {
    JSONObject request;

    @Test
    public void postWithJsonObjectBodyTest (){
        request = new JSONObject();
        request.put("name", "Frank");
        request.put("job","Analyst");
       given().
            body(request).log().body().
       when().
            post(baseReqres + "/users").
       then().
            assertThat().statusCode(201).log().all().and().contentType(ContentType.JSON);
    }
}
