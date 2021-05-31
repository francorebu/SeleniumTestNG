package apiSoapTests;

import base.BaseApiTest;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostSoapCalculatorRequestWithPayloadAndResponseValidationTest extends BaseApiTest {
    File            file;
    String          requestBody;
    FileInputStream fileInputStream;

    public PostSoapCalculatorRequestWithPayloadAndResponseValidationTest(){
        file = new File("resources/soapPayloads/calculatorAddition.xml");
        try {
            fileInputStream = new FileInputStream(file);
            requestBody = IOUtils.toString(fileInputStream,"UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void postSoapCalculatorRequestWithPayloadTest (){

        given().
                contentType("text/xml").
                body(requestBody).log().body().
        when().
                post(baseDneoOnline + "/calculator.asmx").
        then().
                statusCode(200).log().body().and().
                body("//*:AddResult.text()" , equalTo("3"));
    }

}
