package com.example.spring_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot";
    }
}
