package com.APIRestAssuredPrograms.Ex_04_RestAssured_HTTPMethods.Ex02_POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class APITesting_10_POST_BDD_Style {

    public void post_AuthToken(){

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +"}";

        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/auth")
                    .contentType(ContentType.JSON).log().all()
                    .body(payload)
                .when().post()
                .then().log().all().statusCode(200);


    }
}
