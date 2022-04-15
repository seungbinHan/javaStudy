package com.example.springstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyTdd3 {

  @GetMapping("/study3")
  public int tdd3(){
    return 135;
  }

}
