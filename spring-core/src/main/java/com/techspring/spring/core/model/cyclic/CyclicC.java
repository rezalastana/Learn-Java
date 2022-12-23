package com.techspring.spring.core.model.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CyclicC {
  
  private CyclicA cyclicA;

}
