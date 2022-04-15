package com.example.springstudy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = Study5.class)
@ExtendWith(SpringExtension.class)
class Study5Test {

  @Autowired
  MockMvc mvc;

  @Test
  void test5() throws Exception{
    var mvcResult = mvc.perform(
        get("/test5")
    ).andExpect(status().isOk())
        .andExpect(content().string("test5"))
        .andReturn();

    System.out.println("asa"+mvcResult.getResponse().getContentAsString());


  }
}