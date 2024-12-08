package com.api.models.response;

public class UserProfileResponse {
    private int id;
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String mobileNumber;

    public UserProfileResponse(){

    }
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
