package com.APIRestAssuredPrograms.Ex_06_TestValidations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting_27_TestNG_Asssertions {

    @Test
    public void test_hard(){
        System.out.println("Start");
        Assert.assertEquals("vipen", "vipen");
        System.out.println("End");
    }

    @Test
    public void test_soft(){
        System.out.println("Start");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("vipen", "Vipen");
        System.out.println("End");

    }
}
