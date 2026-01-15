package com.APIRestAssuredPrograms.EX_07_PayloadManagement.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class APITesting_29_RestAssured_Payload_Map {
    RequestSpecification rs;
    Response response;
    ValidatableResponse vr;
    String token;
    Integer booking;

    @BeforeClass
    public void generate_token(){
        Map<String, Object> jasontokenusingMap = new LinkedHashMap<>();
        jasontokenusingMap.put("username","admin");
        jasontokenusingMap.put("password","password123");

        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/auth");
        rs.contentType(ContentType.JSON);
        rs.body(jasontokenusingMap).log().all();

        response = rs.when().post();

        vr= response.then().statusCode(200);

        token = response.jsonPath().getString("token");
        System.out.println("Token Generated  " +  token);

    }

    @Test
    public void test_POST(){


        Map<String, Object> jasonBodyUsingMap = new LinkedHashMap<>();
        jasonBodyUsingMap.put("firstname","Jim");
        jasonBodyUsingMap.put("lastname", "Brown");
        jasonBodyUsingMap.put("totalprice",111);
        jasonBodyUsingMap.put("depositpaid",true);


        Map<String,Object> bookingDatesUsingMap = new LinkedHashMap<>();
        bookingDatesUsingMap.put("checkin", "2018-01-01");
        bookingDatesUsingMap.put("checkout","2019-01-01");

        jasonBodyUsingMap.put("bookingdates",bookingDatesUsingMap);
        jasonBodyUsingMap.put("additionalneeds", "Breakfast");
        System.out.println(jasonBodyUsingMap);

        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/booking");
        rs.contentType(ContentType.JSON);
        rs.header("Cookie", "token="+ token);
        rs.body(jasonBodyUsingMap).log().all();
        response = rs.when().post();

        vr = response.then();
        vr.statusCode(200);

        vr.body("booking.firstname", Matchers.equalTo("Jim"));
        vr.body("booking.lastname", Matchers.equalTo("Brown"));
        vr.body("booking.depositpaid", Matchers.equalTo(true));
        vr.body("bookingid", Matchers.notNullValue());




    }

}
