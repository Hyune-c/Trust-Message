package com.example.trustmessage.model;

/*
  1. 재판장에서 유일하게 증인이 누구인지 아는
  2. 증인을 데려올 책임이 있는 전달자

  토끼
 */
public class Communicator {

  private final Witness witness;

  public Communicator(Witness witness) {
    this.witness = witness;
  }

  // 3. 증인석에 입장하라
  public Witness findWitness() {
    return witness;
  }
}
