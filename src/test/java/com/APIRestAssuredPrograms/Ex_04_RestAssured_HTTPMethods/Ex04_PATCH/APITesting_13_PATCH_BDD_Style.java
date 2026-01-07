package com.APIRestAssuredPrograms.Ex_04_RestAssured_HTTPMethods.Ex04_PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;



public class APITesting_13_PATCH_BDD_Style {

    @Test
    public void patch_bdd() {

        String Token = "ffcec3605e2c794";
        String bookingid ="764";

        String payloadpatch = "{\n" +
                "    \"firstname\" : \"Vipendra\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/"+bookingid)
                .contentType(ContentType.JSON)
                .cookie("/token/"+Token)
                .body(payloadpatch).log().all()
                .when().log().all().patch()
                .then().log().all().statusCode(200);

    }

}
