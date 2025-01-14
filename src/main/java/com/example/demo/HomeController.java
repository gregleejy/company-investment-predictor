package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping; // Correct import for @RequestMapping
import org.springframework.web.bind.annotation.RestController; // Import for @RestController

@RestController
@RequestMapping("/api") // Base path for all mappings in this controller
public class HomeController {

    @RequestMapping("/home") // Endpoint for "/api/home"
    public String home() {
        return "Welcome to the HomeController!";
    }
}
