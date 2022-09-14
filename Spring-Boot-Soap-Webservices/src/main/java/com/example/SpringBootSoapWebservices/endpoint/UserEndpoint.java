package com.example.SpringBootSoapWebservices.endpoint;

import com.example.SpringBootSoapWebservices.service.UserService;
import com.example.spring_boot_soap_webservices.GetUserRequest;
import com.example.spring_boot_soap_webservices.GetUserResponse;
import com.example.spring_boot_soap_webservices.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {
    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = "http://example.com/Spring-Boot-Soap-Webservices",
            localPart = "getUserRequest")

    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request){
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.getUsers(request.getName()));
        return response;
    }
}
