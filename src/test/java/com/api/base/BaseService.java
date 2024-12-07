package com.api.base;

import com.api.models.request.LoginPayload;
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
        requestSpecification = RestAssured.given().baseUri(baseURI).contentType(ContentType.JSON);
    }

    protected Response postRequest(Object payload, String endPoint) {
        return requestSpecification.body(payload).post(endPoint);
    }
}
