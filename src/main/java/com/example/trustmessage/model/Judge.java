package com.example.trustmessage.model;

/*
  1. 전달자 - 토끼를 알고 있고
  2. 증언이 필요하지만 아직 증인이 누구인지 모른채로
  3. 재판을 진행할 책임이 있는

  판사
 */
public class Judge {

  private final Communicator communicator;
  private Witness witness;

  public Judge(Communicator communicator) {
    this.communicator = communicator;
  }

  // 1. 재판하라.
  public String doJudge() {
    // 2. 목격자를 불러오라.
    witness = communicator.findWitness();
    // 4. 증언하라.
    // 증언할 것이 있으면 유죄. 없으면 무죄.
    String testimonyKey = "어제분수";
    String testimony = witness.doTestimony(testimonyKey);
    System.out.println(testimony);
    return (testimony.isEmpty())
        ? "Innocence"
        : "Guilty";
  }
}
