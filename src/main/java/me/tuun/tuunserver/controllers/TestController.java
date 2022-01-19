package me.tuun.tuunserver.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class TestController {

  @GetMapping("/")
  public String health() {
    return "Test Works";
  }
}