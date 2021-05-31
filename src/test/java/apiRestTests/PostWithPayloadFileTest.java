package apiRestTests;

import base.BaseApiTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class PostWithPayloadFileTest extends BaseApiTest {
    File file;
    String payload;

    @Test
    public void postCreateUserFromPayload(){
        file = new File("resources/jsonPayloads/createUser.json");
        given().
                body(file).log().body().
        when().
                post( baseReqres + "/users").
        then().
                assertThat().statusCode(201).
                and().contentType(ContentType.JSON);
    }

    @Test
    public void postCreateUserFromPayload2() throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get("resources/jsonPayloads/createUser.json"));
        Response response=
        given().
                body(jsonData).log().body().
        when().
                post(baseReqres + "/users").
        then().
                assertThat().statusCode(201).log().all().
                and().contentType(ContentType.JSON).extract().response();
        System.out.println("Response is : " + response);
    }
}
