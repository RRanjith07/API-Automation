package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.SignupPayload;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountCreationTest {
    @Test(description = "Creating account functionality")
    public void createAccountTest() {
        AuthService authService = new AuthService();
        SignupPayload signupRequestPayload = new SignupPayload.Builder().userName("Ranju123").email("ranjith777@yopmail.com").
                firstName("Ranjith").lastName("Poojary").password("Password1").mobileNumber("9844162479").build();
        Response signUpResponse = authService.signUp(signupRequestPayload);

        System.out.println(signUpResponse.asPrettyString());
        System.out.println(signUpResponse.getStatusCode());
        Assert.assertEquals(signUpResponse.getStatusCode(), 200);

    }
}
