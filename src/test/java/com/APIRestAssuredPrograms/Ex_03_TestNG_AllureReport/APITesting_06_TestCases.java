package com.APIRestAssuredPrograms.Ex_03_TestNG_AllureReport;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_06_TestCases {



    String pincode  = "110059";

    @Test
    public void Get_PositiveTC1(){
        pincode = "@";
        RestAssured
                .given().baseUri("https://api.zippopotam.us/").basePath("/IN/"+pincode).
                when().get()
                .then().log().all().statusCode(200);


    }
    @Test
    public void Get_NegativeTC2(){
        RestAssured
                .given().baseUri("https://api.zippopotam.us/").basePath("/IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);

    }

    @Test
    public void Get_NegativeTC3(){
        pincode = " ";
        RestAssured
                .given().baseUri("https://api.zippopotam.us/").basePath("/IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);



    }
}
