package com.example.demo.controller;

import com.azure.core.annotation.Get;
import com.azure.core.annotation.Post;
import com.example.demo.database.user.Users;
import com.example.demo.service.UsersService;
import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UsersController {

  private final UsersService usersService;


  @GetMapping
  public Map<String, Object> getUser(){

    return null;
  }

  @PostMapping("")
  public Map<String, Object> createUser(Users users) {
    Map<String, Object> map = new HashMap<>();
    map.put("result", usersService.createUsers(users));
    return map;
  };

  @GetMapping("/exists")
  public Map<String, Object> existsUsers(Users users) {
    Map<String, Object> map = new HashMap<>();
    map.put("result", usersService.existsUsers(users));
    return map;
  };

}