package com.example.trustmessage.model2;

import com.example.trustmessage.service.ProductService;
import lombok.RequiredArgsConstructor;

/*
  1. 제품을 만들기 위한

  부품 (인자로서 사용됨을 표시하기 위해 Dto 표기)
 */
@RequiredArgsConstructor
public class Factory {

  private final ProductService productService;

  public void createProduct() {
    PartDto part1 = new PartDto();
    part1.setSteal(true);
    part1.setPropellers(true);
    part1.setButton(true);

    System.out.println("part1 로 Fan 만들기: " + productService.createFan(part1));
  }
}
