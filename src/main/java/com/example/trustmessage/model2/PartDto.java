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

  // 모든 곳에서 필요합니다.
  private Boolean steal;

  // 컴퓨터와 핸드폰에서 필요합니다.
  private Boolean semiconductor;

  // 선풍기에서 필요합니다.
  private Boolean propellers;

  // 선풍기와 핸드폰에서 필요합니다.
  private Boolean button;
}
