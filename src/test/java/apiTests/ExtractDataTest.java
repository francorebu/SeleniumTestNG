package apiTests;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class ExtractDataTest {

    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpec;

    @BeforeClass
    public static void createRequestSpecification(){
        requestSpec = new RequestSpecBuilder().
                setBaseUri("http://zippopotam.us").build();
    }

    @BeforeClass
    public static void createResponseSpecification(){
        responseSpec = new ResponseSpecBuilder().
                expectStatusCode(200).
                expectContentType(ContentType.JSON).build();
    }

    @Test
    public void testZipAndCityValidation(){
        String placeName=
        given().
                spec(requestSpec).
        when().
                get("us/90210").
        then().
                spec(responseSpec).
                extract().path("places[0].'place name'");

        Assert.assertEquals(placeName,"Beverly Hills");
    }

    @Test
    public String testZipAndCityBodyValidation(){
        String resp=
        given().
               spec(requestSpec).
         when().
               get("us/90210").
         then().
               spec(responseSpec).extract().response().body().asString();

         return resp;
    }

    @Test
    public void bodyValidation(){
        Assert.assertTrue(testZipAndCityBodyValidation().contains("Beverly Hills"));
    }
}
