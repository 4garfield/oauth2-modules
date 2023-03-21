package com.sample.oauth2.authorizationserver;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class AuthorizationServerTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void getTokenTest() throws Exception {
    // @formatter:off
    this.mockMvc.perform(
        post("/oauth2/token")
            .contentType(MediaType.APPLICATION_FORM_URLENCODED)
            .param("grant_type", "client_credentials")
            .param("client_id", "client1")
            .param("client_secret", "clientSecretVal")
            .param("scope", "greeting:read")
        )
        .andExpect(status().isOk());
    // @formatter:on
  }
}
