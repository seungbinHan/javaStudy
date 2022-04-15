package com.example.springstudy;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudyTdd2 {

  @PostMapping("/study2")
  public String studyTdd2(){
    return "real!?";
  }

}
