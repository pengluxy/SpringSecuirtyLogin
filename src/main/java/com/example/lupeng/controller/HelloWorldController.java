package com.example.lupeng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloo")
    public String helloWorld() {
        return "Hello World";
    }
}