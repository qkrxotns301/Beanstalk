package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${spring.profiles.active:}")
    private String activeProfile;

    @GetMapping("/")
    public String helloWorld() {
        return "hello world!!!!";
    }

    @GetMapping("/profile")
    public String profile() {
        return activeProfile;
    }
}
