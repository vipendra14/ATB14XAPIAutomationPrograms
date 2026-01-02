package com.APIRestAssuredPrograms.Ex_02_RA_Concepts;

public class APITesting_04_BuildPattern {
    public APITesting_04_BuildPattern step1(){
        System.out.println("Step _1");
        return this;
    }

    public APITesting_04_BuildPattern step2(){
        System.out.println("Step _2");
        return this;
    }

    public APITesting_04_BuildPattern step3( String pattern){
        System.out.println("Step _3");
        return this;
    }

    public static void main(String [] args){
        APITesting_04_BuildPattern bp = new APITesting_04_BuildPattern();
        bp.step1().step2().step3("Hello Step 3");
    }

}
