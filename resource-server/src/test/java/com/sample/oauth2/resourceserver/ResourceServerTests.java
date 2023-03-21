package com.sample.oauth2.resourceserver;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class ResourceServerTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void getTokenTest() throws Exception {
    this.mockMvc.perform(get("/")).andExpect(status().isUnauthorized());
  }

}
