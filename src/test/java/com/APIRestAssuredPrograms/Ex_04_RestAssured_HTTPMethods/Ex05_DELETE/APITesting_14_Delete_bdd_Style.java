package com.APIRestAssuredPrograms.Ex_04_RestAssured_HTTPMethods.Ex05_DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting_14_Delete_bdd_Style {

    @Test
    public void delete_bdd_style(){

        String token = "ffcec3605e2c794";
        String booking_id = "764";

        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("booking"+booking_id).contentType(ContentType.JSON)
                    .cookie("token", token)
                .when().log().all().delete()
                .then().log().all().statusCode(404);



    }
}
