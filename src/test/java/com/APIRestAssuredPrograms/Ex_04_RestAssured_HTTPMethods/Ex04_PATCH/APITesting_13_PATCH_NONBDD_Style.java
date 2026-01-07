package com.APIRestAssuredPrograms.Ex_04_RestAssured_HTTPMethods.Ex04_PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_13_PATCH_NONBDD_Style {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void patch_Nonbdd(){

        String token = "59d091a0aaeb39c";
        String bookingid = "4216";

        String payload = "{\n" +
                "    \"firstname\" : \"Vipen\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+bookingid);

        r.contentType(ContentType.JSON);
        r.cookie("token", token);
        r.body(payload).log().all();

        response = r.when().log().all().patch();

        vr= response.then().log().all();
        vr.statusCode(200);




    }
}
