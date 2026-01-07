package com.APIRestAssuredPrograms.Ex_04_RestAssured_HTTPMethods.Ex03_PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting_12_PUT_BDD_Style {


    @Test
    public void put_bdd(){

        String Token = "52efae38df05fb3";
        String bookingid ="505";

        String payload = "{\n" +
                "    \"firstname\" : \"Vipen\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com").basePath("/booking/"+bookingid)
                    .contentType(ContentType.JSON)
                    .cookie("token",Token)
                    .body(payload).log().all()
                .when().log().all().put()
                .then().log().all().statusCode(200);
    }
}
