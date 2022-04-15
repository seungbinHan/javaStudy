package com.example.springstudy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = StudyTdd.class)
class StudyTddTest {

  @Autowired
  private MockMvc mvc;
  String testString1 = "test1";
  String testString2 = "test2";

  @Test
  void study1Tdd() throws Exception {
    mvc.perform(get("/study1Tdd").param("inp1",testString1).param("inp2",testString2))
        .andExpect(status().isOk())
        .andExpect(content().string(testString1+testString2));
  }
}