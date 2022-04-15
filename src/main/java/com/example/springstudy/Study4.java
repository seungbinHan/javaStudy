package com.example.springstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Study4 {

  @GetMapping("/study4")
  public String test4(){
    return "123123123";
  }

}
