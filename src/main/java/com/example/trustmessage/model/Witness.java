package com.example.trustmessage.model;

/*
  1. 증언할 책임이 있는

  증인
 */
public class Witness {

  private final String testimony;

  public Witness(String testimony) {
    this.testimony = testimony;
  }

  public String doTestimony() {
    return testimony;
  }
}
