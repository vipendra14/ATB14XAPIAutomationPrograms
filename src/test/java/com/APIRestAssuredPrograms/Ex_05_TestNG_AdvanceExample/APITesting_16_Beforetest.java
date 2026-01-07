package com.APIRestAssuredPrograms.Ex_05_TestNG_AdvanceExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_16_Beforetest {

    @BeforeTest
    public void get_Token(){
        System.out.println("Token Generated");

    }

    @BeforeTest
    public void get_bookingid(){
        System.out.println("Boking id");

    }

    @Test
    public void put_request(){
        System.out.println("PUT request sent");

    }
    @AfterTest
    public void close_test(){
        System.out.println("Close the test");

    }
}
