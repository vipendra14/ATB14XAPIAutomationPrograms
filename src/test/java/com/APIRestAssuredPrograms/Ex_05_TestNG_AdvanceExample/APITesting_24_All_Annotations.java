package com.APIRestAssuredPrograms.Ex_05_TestNG_AdvanceExample;

import org.testng.annotations.*;

public class APITesting_24_All_Annotations {

    @BeforeSuite
    public void bfsuite(){
        System.out.println("Before suite");
    }

    @BeforeTest
    public void bftest(){
        System.out.println("Before test");

    }
    @BeforeClass
    public void bfclass(){
        System.out.println("Before class");
    }

    @BeforeMethod
    public void bfmethod(){
        System.out.println("Before Method");
    }

    @Test
    public void testcase(){
        System.out.println("test : I am at the centre of test case execution");
    }

    @AfterMethod
    public void afmethod(){
        System.out.println("AfterMethod");
    }


    @AfterClass
    public void afclass(){
        System.out.println("Afterclass");
    }

    @AfterTest
    public void aftest(){
        System.out.println("After Test");
    }

    @AfterSuite
    public void afsuite(){
        System.out.println("After Suite");
    }
}
