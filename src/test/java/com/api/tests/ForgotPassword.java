package com.api.tests;

import com.api.base.AuthService;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPassword {

    @Test
    public void forgotPasswordTest(){
        AuthService authService = new AuthService();
        Response forgotPasswordResponse = authService.forgotPassword("ranjith777@yopmail.com");
        System.out.println(forgotPasswordResponse.asPrettyString());
        Assert.assertEquals(forgotPasswordResponse.getStatusCode(),200);
    }
}
