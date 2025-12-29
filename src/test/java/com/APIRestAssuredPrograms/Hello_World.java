package com.APIRestAssuredPrograms;

import io.restassured.RestAssured;

public class Hello_World {
    public static void main(String[] args) {
        RestAssured
                .given().baseUri("https://www.google.com/").log().all()
                .when().get()
                .then().statusCode(200).log().all();

    }
}
