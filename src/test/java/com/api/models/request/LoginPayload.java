package com.api.models.request;

public class LoginPayload {
    private String username;
    private String password;

    public LoginPayload(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginPayload{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
