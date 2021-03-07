package com.example.application.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {
  @GetMapping(value="/")
  public String getMethodName() {
    return "Hello World";
  }
}
