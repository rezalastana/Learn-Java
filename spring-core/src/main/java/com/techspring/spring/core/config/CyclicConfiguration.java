package com.techspring.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.techspring.spring.core.model.cyclic.CyclicA;
import com.techspring.spring.core.model.cyclic.CyclicB;
import com.techspring.spring.core.model.cyclic.CyclicC;

@Configuration
public class CyclicConfiguration {
  
  @Bean
  public CyclicA cyclicA(CyclicB cyclicB){
    return new CyclicA(cyclicB);
  }

  @Bean
  public CyclicB cyclicB(CyclicC cyclicC){
    return new CyclicB(cyclicC);
  }

  @Bean
  public CyclicC cyclicC(CyclicA cyclicA){
    return new CyclicC(cyclicA);
  }

}
