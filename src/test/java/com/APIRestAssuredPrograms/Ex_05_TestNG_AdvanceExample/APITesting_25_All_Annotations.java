package com.APIRestAssuredPrograms.Ex_05_TestNG_AdvanceExample;

import org.testng.annotations.*;

public class APITesting_25_All_Annotations {

    @BeforeTest
    public void tc1(){
        System.out.println("Before test");
    }

    @BeforeMethod
    public void tc2(){
        System.out.println("Before method");
    }


    @Test
    public void tc3(){
        System.out.println("In Test");
    }
    @AfterMethod
    public void tc4(){
        System.out.println("After Method");
    }

    @AfterTest
    public void tc5(){
        System.out.println("After Test");
    }
}
