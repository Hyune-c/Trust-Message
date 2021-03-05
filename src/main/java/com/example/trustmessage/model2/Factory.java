package com.example.trustmessage.model2;

import com.example.trustmessage.model2.PartDto.PartOf;
import com.example.trustmessage.service.ProductService;
import lombok.RequiredArgsConstructor;

/*
  1. 제품을 만드는 서비스를 호출하는

  객체
 */
@RequiredArgsConstructor
public class Factory {

  private final ProductService productService;

  public void createProduct() {
    PartDto part1 = new PartDto();
    part1.setSteal(true);
    part1.setPropellers(true);
    part1.setButton(true);

    if (part1.naming(PartOf.FAN)) {
      System.out.println("part1 로 FAN 만들기: " + productService.create(part1));
    }

    PartDto part2 = new PartDto();
    part2.setSteal(true);
    part2.setPropellers(true);
    part2.setButton(true);

    // 검증에 실패해 제품 생산을 위한 요청 (메시지) 를 보내지 않습니다.
    if (part2.naming(PartOf.COMPUTER)) {
      System.out.println("part2 로 COMPUTER 만들기: " + productService.create(part2));
    }
  }
}
