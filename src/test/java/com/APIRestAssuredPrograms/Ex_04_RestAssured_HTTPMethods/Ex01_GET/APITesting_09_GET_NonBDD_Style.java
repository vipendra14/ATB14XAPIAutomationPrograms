package com.APIRestAssuredPrograms.Ex_04_RestAssured_HTTPMethods.Ex01_GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_09_GET_NonBDD_Style {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pincode;

    @Test
    public void test_non_bdd(){
        pincode = "831006";
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us/");
        r.basePath("/IN/"+pincode);

        response = r.when().log().all().get();
        System.out.println(response.asString());

        vr = response.then().log().all();
        vr.statusCode(200);


    }
}
