package com.example.trustmessage.model;

import java.util.Map;
import org.junit.jupiter.api.Test;

class JudgeTest {

  @Test
  public void 정상_재판하라() {
    // given
    Map<String, String> testimonyMap = Map.of(
        "어제왕국", "엘리스를 보았어요!",
        "오늘광장", "저는 보잘 것 없는 사람입니다.");
    // 1. 증언할 말이 있는 증인 - 모자장수
    Witness madHatter = new Witness(testimonyMap);
    // 2. 모자장수를 알고 있는 전달자 - 토끼
    Communicator rabbit = new Communicator(madHatter);
    // 3. 토끼를 알고 있는 판사 - 왕
    Judge king = new Judge(rabbit);

    // when
    // 4. `어제왕국` 의 일을 재판하라!
    String judgeResult = king.doJudge();

    // then
    System.out.println(judgeResult);
  }
}
