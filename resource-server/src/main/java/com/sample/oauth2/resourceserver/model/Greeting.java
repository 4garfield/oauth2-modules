package com.sample.oauth2.resourceserver.model;

public class Greeting {

  private final String id;
  private final String message;

  public Greeting(String id, String message) {
    this.id = id;
    this.message = message;
  }

  public String getId() {
    return this.id;
  }

  public String getMessage() {
    return this.message;
  }

}
