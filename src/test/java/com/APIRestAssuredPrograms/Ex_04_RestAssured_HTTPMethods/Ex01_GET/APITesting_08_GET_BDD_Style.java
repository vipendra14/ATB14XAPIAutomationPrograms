package com.APIRestAssuredPrograms.Ex_04_RestAssured_HTTPMethods.Ex01_GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_08_GET_BDD_Style {

    @Test
    public void test_GETBDD(){
        String pincode= "831002";


        RestAssured
                .given().baseUri("https://api.zippopotam.us/").basePath("/IN/"+pincode)
                .when().get()
                .then().log().all().statusCode(200);

}


}
