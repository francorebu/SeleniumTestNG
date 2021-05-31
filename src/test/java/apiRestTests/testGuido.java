package apiRestTests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class testGuido {

    @Test
    public void testGetExample(){
        given().
        when().
            get( "https://reqres.in/api/users/2").
        then().
                assertThat().statusCode(200);
    }
}
