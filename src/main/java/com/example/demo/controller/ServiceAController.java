package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class ServiceAController {

    @GetMapping()
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    @GetMapping("/internalServerError")
    public ResponseEntity<String> giveInternalServerError() {
        return new ResponseEntity<>("Hello Exception", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/resourceNotFound")
    public ResponseEntity<String> giveResourceNotFound() {
        return new ResponseEntity<>("Resource Not Found", HttpStatus.NOT_FOUND);
    }
}
