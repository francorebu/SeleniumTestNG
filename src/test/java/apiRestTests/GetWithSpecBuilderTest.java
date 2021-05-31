package apiRestTests;
import base.BaseApiTest;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetWithSpecBuilderTest extends BaseApiTest {

    private  RequestSpecification requestSpec;
    private  ResponseSpecification responseSpec;

    public GetWithSpecBuilderTest(){
        requestSpec = new RequestSpecBuilder().
                setBaseUri(baseZippo).build();
        responseSpec = new ResponseSpecBuilder().
                expectStatusCode(200).
                expectContentType(ContentType.JSON).build();
    }

    @Test
    public void getWithSpecBuilderTest() {
        given().
                spec(requestSpec).
        when().
                get("us/90210").
        then().
                spec(responseSpec).log().body();
    }

}
