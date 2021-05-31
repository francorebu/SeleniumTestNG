package apiRestTests;

import base.BaseApiTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetWithResponsePrintInfoTest extends BaseApiTest {

    @Test
    public void getWithResponseValidationTest() {
        Response response= RestAssured.get(baseReqres+"/users?page=2");
        System.out.println("Response Status code is: " + response.getStatusCode());
        System.out.println("Response time is       : " + response.getTime());
        System.out.println("Response Body is       : " + response.getBody().asString());

    }
}
