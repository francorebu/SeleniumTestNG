package apiSoapTests;

import base.BaseApiTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostSoapCalculatorRequestTest extends BaseApiTest {

    @Test
    public void postSoapCalculatorRequestTest (){
        given().
                contentType("text/xml").
                body("<Envelope xmlns=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                        "   <Body>\n" +
                        "      <Add xmlns=\"http://tempuri.org/\">\n" +
                        "         <intA>2</intA>\n" +
                        "         <intB>1</intB>\n" +
                        "      </Add>\n" +
                        "   </Body>\n" +
                        "</Envelope>").log().body().
        when().
                post(baseDneoOnline + "/calculator.asmx").
        then().
                statusCode(200).log().body();
    }

}
