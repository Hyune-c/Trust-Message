package com.example.trustmessage.model2;

import com.example.trustmessage.service.ProductService;
import org.junit.jupiter.api.Test;

class FactoryTest {

  @Test
  public void 상품을_만들어라() {
    // given
    Factory factory = new Factory(new ProductService());

    // when
    // 4. `어제분수` 의 일을 재판하라!
    factory.createProduct();

    // then
  }
}
