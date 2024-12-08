package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserManagementService;
import com.api.models.request.LoginPayload;
import com.api.models.request.UpdateProfile;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateProfileTest {
    @Test
    public void updateProfileTest() {
        AuthService authService = new AuthService();
        Response response = authService.login(new LoginPayload("uday1234", "uday1234"));
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println("-----------------------Login Response--------------------------------------------");
        System.out.println(response.asPrettyString());

        UserManagementService userManagementService = new UserManagementService();
        response = userManagementService.getProfile(loginResponse.getToken());
        System.out.println("---------------User Management Response-------------------------------------------------------");
        System.out.println(response.asPrettyString());
        UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
        Assert.assertEquals(userProfileResponse.getUsername(), "uday1234");

        UpdateProfile updateProfile = new UpdateProfile.Builder().firstName("Raaj").lastName("LastName").
                email("Ranjith1237@yopmail.com").mobileNumber("9844162234").build();
        response = userManagementService.updateProfile(loginResponse.getToken(), updateProfile);
        System.out.println("----------------Update Profile Response-----------------------------------------------------------------");
        System.out.println(response.asPrettyString());
    }
}
