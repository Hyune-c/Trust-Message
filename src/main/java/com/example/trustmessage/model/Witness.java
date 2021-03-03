package com.example.trustmessage.model;

import java.util.Map;

/*
  1. 증언할 책임이 있는

  증인
 */
public class Witness {

  private final Map<String, String> testimonyMap;

  public Witness(Map<String, String> testimonyMap) {
    this.testimonyMap = testimonyMap;
  }

  public String doTestimony(String testimonyKey) {
    return (testimonyMap.containsKey(testimonyKey))
        ? testimonyMap.get(testimonyKey)
        : "";
  }
}
