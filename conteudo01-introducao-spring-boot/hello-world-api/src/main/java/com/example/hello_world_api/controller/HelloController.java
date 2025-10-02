package com.example.hello_world_api.controller;

import com.example.hello_world_api.model.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


 
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World! Bem-vindo ao Spring Boot!";
    }
    
    @GetMapping("/hello/json")
    public HelloResponse helloJson() {
        return new HelloResponse("Hello World!", "Primeira API REST com Spring Boot");
    }
}
