package com.example.springstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyTdd {

  @GetMapping("/study1Tdd")
  public String study1Tdd(String inp1, String inp2){
    return inp1+inp2;
  }
}
