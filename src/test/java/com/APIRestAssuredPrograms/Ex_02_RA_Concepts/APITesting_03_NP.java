package com.APIRestAssuredPrograms.Ex_02_RA_Concepts;

public class APITesting_03_NP {
    public void step1(){
        System.out.println("Step 1");
    }

    public void step2(){
        System.out.println("Step 2");
    }

    public void step3(String args){
        System.out.println("Step 3");
    }
    public static void main(String []args){
        APITesting_03_NP np = new APITesting_03_NP();
        np.step1();
        np.step2();
        np.step3("Hello API");


    }
}
