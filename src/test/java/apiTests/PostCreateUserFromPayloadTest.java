package apiTests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.request;

public class PostCreateUserFromPayloadTest {
    File file;
    String payload;

    @Test
    public void postCreateUserFromPayload(){
        file = new File("resources/Payloads/createUser.json");
        given().
                contentType(ContentType.JSON).
                body(file).log().body().
        when().
                post("https://reqres.in/api/users").
        then().
                assertThat().statusCode(201).
                and().contentType(ContentType.JSON);
    }

    @Test
    public void postCreateUserFromPayload2() throws IOException {
        byte[] jsonData = Files.readAllBytes(Paths.get("resources/Payloads/createUser.json"));
        Response response=
        given().
                body(jsonData).log().body().
                when().
                post("https://reqres.in/api/users").
                then().
                assertThat().statusCode(201).log().all().
                and().contentType(ContentType.JSON).extract().response();
        System.out.println("Response is : " + response);
    }
}
