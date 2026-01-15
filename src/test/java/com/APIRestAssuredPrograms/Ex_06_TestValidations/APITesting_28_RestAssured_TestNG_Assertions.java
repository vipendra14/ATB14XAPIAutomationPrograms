package com.APIRestAssuredPrograms.Ex_06_TestValidations;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class APITesting_28_RestAssured_TestNG_Assertions {

    RequestSpecification rs;
    Response response;
    ValidatableResponse vr;
    Integer bookingId;

@Test
        public void test_POST(){

    String payload= "{\n" +
            "    \"firstname\" : \"Jim\",\n" +
            "    \"lastname\" : \"Brown\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : false,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";

    rs= RestAssured.given();
    rs.baseUri("https://restful-booker.herokuapp.com");
    rs.basePath("/booking");
    rs.contentType(ContentType.JSON);
    rs.body(payload).log().all();


    response= rs.when().post();

    vr= response.then().log().all();
    vr.statusCode(200);


    vr.body("booking.firstname", Matchers.equalTo("Jim"));
    vr.body("booking.lastname", Matchers.equalTo("Brown"));
    vr.body("booking.depositpaid",Matchers.equalTo(false));
    vr.body("bookingid", Matchers.notNullValue());

    bookingId = response.then().extract().path("bookingid");
    String firstname = response.then().extract().path("booking.firstname");
    String lastname = response.then().extract().path("booking.lastname");


    Assert.assertEquals(firstname, "Jim");
    Assert.assertEquals(lastname, "Brown");
    Assert.assertNotNull(bookingId);


    assertThat(bookingId).isPositive().isNotNull().isNotZero();
    assertThat(firstname).isNotBlank().isNotEmpty().isNotNull().isEqualTo("Jim");

        }



}