package com.example.names_lab.controllers;

import com.example.names_lab.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greet")
    public Greeting greet(@RequestParam(value = "name", defaultValue = "") String name) {
        String timeOfDay = "afternoon";
        return new Greeting(name, timeOfDay);
    }
}