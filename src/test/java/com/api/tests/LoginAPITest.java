package com.api.tests;

import com.api.base.AuthService;
import com.api.models.request.LoginPayload;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
http://64.227.160.186:8080/swagger-ui/index.html

converting java object to json with the help gson etc ---> Serialization
converting json to java object --> Deserialization*/

public class LoginAPITest {
    @Test(description = "Verify login functionality")
    public void loginTest() {
        LoginPayload loginPayload = new LoginPayload("uday1234", "uday1234");
        AuthService authService = new AuthService();
        Response response = authService.login(loginPayload);
        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(), 200);

        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(loginResponse.getId());
        System.out.println(loginResponse.getUsername());

        Assert.assertEquals(loginResponse.getEmail(), "ashauttap345@gmail.com");
        Assert.assertFalse(loginResponse.getToken().isEmpty());
        Assert.assertEquals(loginResponse.getId(), 3);
    }
}
