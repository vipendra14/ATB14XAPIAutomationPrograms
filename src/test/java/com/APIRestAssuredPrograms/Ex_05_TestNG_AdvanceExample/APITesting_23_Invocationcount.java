package com.APIRestAssuredPrograms.Ex_05_TestNG_AdvanceExample;

import org.testng.annotations.Test;

public class APITesting_23_Invocationcount {

    @Test(invocationCount = 3)
    public void testcase1(){
        System.out.println("3");

    }

    @Test(invocationCount = 2)
    public void testcase2(){
        System.out.println("2");
    }
}
