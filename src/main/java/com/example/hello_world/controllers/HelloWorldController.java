package com.example.hello_world.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/helloworld")
@RestController
public class HelloWorldController {

    public ResponseEntity<?> response(){
        return ResponseEntity.ok("Hello, World!");
    }
}
