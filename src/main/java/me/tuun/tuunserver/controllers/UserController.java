package me.tuun.tuunserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.tuun.tuunserver.models.User;
import me.tuun.tuunserver.services.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/")
  public String health() {
    return "Test Works";
  }

  @GetMapping("/api/v1/users/{userId}")
  public User getUserById(@PathVariable("userId") Integer userId) {
    return userService.getUserById(userId);
  }
}