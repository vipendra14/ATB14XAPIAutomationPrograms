package com.APIRestAssuredPrograms.Ex_05_TestNG_AdvanceExample;


import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_21_Enabled {

    @Test
    public void tc1(){
        Assert.assertTrue(false);

    }

    @Test(enabled = false)
    public void tc2(){
        Assert.assertTrue(true);

    }

    @Test
    public void tc3(){
        Assert.assertTrue(true);

    }
}
