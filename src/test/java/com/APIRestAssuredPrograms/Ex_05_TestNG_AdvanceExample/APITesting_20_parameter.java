package com.APIRestAssuredPrograms.Ex_05_TestNG_AdvanceExample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_20_parameter {

    @Parameters("browser")
    @Test
    public void tc1(String value){
        System.out.println("Execute this line of code using parameters");

        if (value.equalsIgnoreCase("firefox")){
            System.out.println("this line is executed using firefox");
        }

        if (value.equalsIgnoreCase("chrome")){
            System.out.println("This line of code is executed using chrome");
        }
    }
}
