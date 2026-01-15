package com.APIRestAssuredPrograms.Ex_05_TestNG_AdvanceExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_19_DependsonMethods {

    @Test
    public void serverStartedOk(){
        System.out.println("I am the first one to be executed");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void tc2(){
        Assert.assertTrue(true);
        System.out.println("TC2");

    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void tc3(){
        System.out.println("TC3");
        Assert.assertTrue(true);
    }
}
