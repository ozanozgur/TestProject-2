package services;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


import static constants.TestData.TEST_API_URL;
import static io.restassured.RestAssured.given;

public class TestService {

    public Response getInstallments(Long value){

        return given()
                .baseUri(TEST_API_URL)
                .contentType(ContentType.JSON)
                .header("Content-Type" ,"application/json;charset=UTF-8")
                .when()
                .queryParam("installment" , value)
                .get("/test?installment=" + value)
                .then()
                .extract()
                .response();
    }
}
