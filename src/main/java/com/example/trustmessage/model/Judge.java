package com.example.trustmessage.model;

/*
  1. 전달자 - 토끼를 알고 있고
  2. 재판을 진행할 책임이 있는

  판사
 */
public class Judge {

  private final Communicator communicator;
  private Witness witness;

  public Judge(Communicator communicator) {
    this.communicator = communicator;
  }

  // 1. 재판하라.
  public void doJudge() {
    // 2. 목격자를 불러오라.
    witness = communicator.findWitness();
    // 4. 증언하라.
    System.out.println(witness.doTestimony());
  }
}
