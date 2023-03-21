package com.sample.oauth2.resourceserver.controller;

import java.util.UUID;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.oauth2.resourceserver.model.Greeting;

@RestController
public class ResourceServerController {

  @GetMapping("/")
  public String index(@AuthenticationPrincipal Jwt jwt) {
    return String.format("Hello, %s!", jwt.getSubject());
  }

  @GetMapping("/greeting")
  @ResponseBody
  public Greeting getGreeting() {
    return new Greeting(UUID.randomUUID().toString(), "hello world");
  }

}
