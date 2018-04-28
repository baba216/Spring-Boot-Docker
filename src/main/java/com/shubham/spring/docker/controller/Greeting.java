package com.shubham.spring.docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

  @GetMapping("/hello")
  public ResponseEntity<String> hello() {
    return ResponseEntity.ok("Hello");
  }
}
