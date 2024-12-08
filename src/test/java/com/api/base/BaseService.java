package com.api.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
    /*
    Handling Base URI
    Creating the request
    Handling the response
     */
    private static final String baseURI = "http://64.227.160.186:8080";
    private RequestSpecification requestSpecification;

    public BaseService() {
        requestSpecification = RestAssured.given().baseUri(baseURI);
    }

    protected void setAuthToken(String token) {
        requestSpecification.header("Authorization", "Bearer " + token);
    }

    protected Response getRequest(String endPoint) {
        return requestSpecification.get(endPoint);
    }

    protected Response postRequest(Object payload, String endPoint) {
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endPoint);
    }

    protected Response putRequest(Object payload, String endPoint) {
        return requestSpecification.contentType(ContentType.JSON).body(payload).put(endPoint);
    }
}
