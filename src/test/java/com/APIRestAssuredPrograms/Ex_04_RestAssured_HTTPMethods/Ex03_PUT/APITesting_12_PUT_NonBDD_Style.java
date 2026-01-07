package com.APIRestAssuredPrograms.Ex_04_RestAssured_HTTPMethods.Ex03_PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_12_PUT_NonBDD_Style {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void put_nonbdd(){

        String Token = "ffcec3605e2c794";
        String bookingid ="764";

     //   Faker fake = new Faker();
     //   String name = fake.name().fullname();
      //  System.out.println(name);

        String payload = "{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
        r = RestAssured.given();
               r.baseUri("https://restful-booker.herokuapp.com");
               r.basePath("/booking/"+bookingid);


               r.contentType(ContentType.JSON);
               r.cookie("token", Token);
             //  r.auth().digest();
               r.body(payload).log().all();

               response = r.when().log().all().put();

               vr = response.then().log().all();
               vr.statusCode(200);




    }

}
