package com.APIRestAssuredPrograms.Ex_05_TestNG_AdvanceExample;

import io.restassured.internal.assertbridge.GroovyAssertBridge;
import org.testng.annotations.Test;

public class APITesting_18_Groups {

    @Test(groups = {"Sanity", "Reg"})
    public void sanity_run(){
        System.out.println("Sanity");

    }

    @Test(groups={"Reg"})
    public void reg_run(){
        System.out.println("Reg");

    }
    @Test(groups={"Reg","smoke"})
    public void smoke_run(){
        System.out.println("Smoke");
    }
}
