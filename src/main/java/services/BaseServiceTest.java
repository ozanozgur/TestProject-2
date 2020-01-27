package services;

import io.restassured.RestAssured;
import static constants.TestData.TEST_API_URL;


public class BaseServiceTest {

    protected TestService installmentApiService = new TestService();

    public BaseServiceTest(){
        RestAssured.baseURI = TEST_API_URL;
    }
}
