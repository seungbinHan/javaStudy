package com.example.springstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Study5 {
  @GetMapping("/test5")
  public String test5(){
    return "test5";
  }

}
