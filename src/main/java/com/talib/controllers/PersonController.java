package com.talib.controllers;

import com.talib.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonService service;

    @GetMapping("/persons")
    public ResponseEntity<?> getAllPerson() {

        return ResponseEntity.ok(service.getAllPerson());
    }
}
