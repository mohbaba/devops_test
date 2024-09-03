package com.example.hello_world.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api")
@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public ResponseEntity<?> response(){
        return ResponseEntity.ok("Hello, World!!");

    }
}
