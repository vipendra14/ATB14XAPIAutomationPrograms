package com.APIRestAssuredPrograms.Ex_05_TestNG_AdvanceExample;

import org.testng.annotations.Test;

public class APITesting_17_Priority {

    @Test(priority = 3)
    public void tc1(){
        System.out.println("TC1");

    }

    @Test (priority = 2)
    public void tc2(){
        System.out.println("TC2");

    }

    @Test (priority = 1)
    public void tc3(){
        System.out.println("TC3");

    }
}
