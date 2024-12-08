package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.models.request.LoginPayload;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetProfileRequestTest {
    @Test
    public void getProfileTest() {
        AuthService authService = new AuthService();
        UserManagementService userManagementService = new UserManagementService();
        Response response = authService.login(new LoginPayload("uday1234", "uday1234"));
        LoginResponse loginResponse = response.as(LoginResponse.class);
        Response getProfileResponse = userManagementService.getProfile(loginResponse.getToken());
        UserProfileResponse profileResponse = getProfileResponse.as(UserProfileResponse.class);
        System.out.println(profileResponse.getEmail());
        System.out.println(profileResponse.getMobileNumber());

    }
}
