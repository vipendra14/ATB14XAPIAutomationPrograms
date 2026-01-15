package com.APIRestAssuredPrograms.Ex_05_TestNG_AdvanceExample;

import io.restassured.internal.assertbridge.GroovyAssertBridge;
import org.testng.annotations.Test;

public class APITesting_18_Groups {

    @Test(groups = {"sanity", "reg"})
    public void sanity_run(){
        System.out.println("sanity");

    }

    @Test(groups={"reg"})
    public void reg_run(){
        System.out.println("reg");

    }
    @Test(groups={"smoke"})
    public void smoke_run(){
        System.out.println("Smoke " + " reg");
    }
}
