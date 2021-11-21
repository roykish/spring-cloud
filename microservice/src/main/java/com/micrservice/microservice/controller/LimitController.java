package com.micrservice.microservice.controller;

import com.micrservice.microservice.Model.Limit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @GetMapping("/limit")
    public Limit retrieveLimit(){
        return new Limit(1,1000);
    }
}
