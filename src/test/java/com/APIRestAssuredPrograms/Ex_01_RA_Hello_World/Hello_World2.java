package com.APIRestAssuredPrograms.Ex_01_RA_Hello_World;

import io.restassured.RestAssured;

public class Hello_World2 {
    public static void main(String[] args) {

        RestAssured
                .given().baseUri("https://paytm.com/").log().all()
                .when().get()
                .then().statusCode(200).log().all();


    }
}
