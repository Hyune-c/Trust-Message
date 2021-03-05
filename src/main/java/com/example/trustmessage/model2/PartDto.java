package com.example.trustmessage.model2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
  1. 제품을 만들기 위한

  부품 (인자로서 사용됨을 표시하기 위해 Dto 표기)
 */
@Setter
@Getter
@NoArgsConstructor
public class PartDto {

  public enum PartOf {
    COMPUTER,
    FAN,
    PHONE,
    UNKNOWN
  }

  private PartDto.PartOf partOf;

  // 모든 곳에서 필요합니다.
  private Boolean steal = false;

  // 컴퓨터와 핸드폰에서 필요합니다.
  private Boolean semiconductor = false;

  // 선풍기에서 필요합니다.
  private Boolean propellers = false;

  // 선풍기와 핸드폰에서 필요합니다.
  private Boolean button = false;

  public boolean naming(PartDto.PartOf partOf) {
    if (partOf.equals(PartOf.COMPUTER) && this.getSteal() && this.getSemiconductor()) {
      this.partOf = PartOf.COMPUTER;
    }

    if (partOf.equals(PartOf.FAN) && this.getSteal() && this.getPropellers() && this.getButton()) {
      this.partOf = PartOf.FAN;
    }

    if (partOf.equals(PartOf.PHONE) && this.getSteal() && this.getSemiconductor() && this.getButton()) {
      this.partOf = PartOf.PHONE;
    }

    if (this.partOf == null) {
      this.partOf = PartOf.UNKNOWN;
      return false;
    }

    return true;
  }
}
