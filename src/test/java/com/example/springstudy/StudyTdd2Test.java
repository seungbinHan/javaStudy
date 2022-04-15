package com.example.springstudy;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(controllers = StudyTdd2.class)
@ExtendWith(SpringExtension.class)
class StudyTdd2Test {

  @Autowired
  MockMvc mvc;

  @Test
  void studyTdd2() throws Exception {

    String testStr="real!?";

    mvc.perform(
        post("/study2") )
        .andExpect(status().isOk())
        .andExpect(content().string(testStr)
        );
  }
}