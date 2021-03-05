package com.example.trustmessage.service;

import com.example.trustmessage.model2.PartDto;

/*
  1. 제품을 만들기 위한 부품이 있는지 확인하고

  있으면 만드는 서비스
 */
public class ProductService {

  public boolean createComputer(PartDto partDto) {
    if (partDto.getSteal() && partDto.getSemiconductor()) {
      // do work...
      return true;
    }

    return false;
  }

  public boolean createFan(PartDto partDto) {
    if (partDto.getSteal() && partDto.getPropellers() && partDto.getButton()) {
      // do work...
      return true;
    }

    return false;
  }

  public boolean createPhone(PartDto partDto) {
    if (partDto.getSteal() && partDto.getSemiconductor() && partDto.getButton()) {
      // do work...
      return true;
    }

    return false;
  }
}
