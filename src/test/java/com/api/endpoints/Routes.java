package com.api.endpoints;

/*
Create User (POST) https://petstore.swagger.io/v2/user
Get user (GET) https://petstore.swagger.io/v2/user/{username}
Update user (PUT) https://petstore.swagger.io/v2/user{username}
Delete user (DELETE) https://petstore.swagger.io/v2/user{username}
 */

public class Routes {
    public static final String baseURL = "https://petstore.swagger.io/v2";
    public static String postUrl = baseURL + "/user";
    public static String getUrl = baseURL + "user/{username}";
    public static String updateUrl = baseURL + "user/{username}";
    public static String deleteUrl = baseURL + "user/{username}";


}
