package com.APIRestAssuredPrograms.Ex_05_TestNG_AdvanceExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_22_Alwaysrun {

    @Test
    public void new_user_registration(){
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void login_page(){
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void normal_condition(){
        Assert.assertTrue(true);
    }
}
