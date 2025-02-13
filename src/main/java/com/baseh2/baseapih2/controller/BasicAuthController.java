package com.baseh2.baseapih2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BasicAuthController {

    @GetMapping("/public")
    public String getPublicEndpoint(){
        return "Hello this is public endpoint";
    }

    @GetMapping("/private")
    public String getPrivateEndpoint(){
        return "Hello this is private endpoint";
    }

    @GetMapping("/manager")
    public String getManagerEndpoint(){
        return "Hello this is manager endpoint";
    }
}
