package com.techspring.spring.core.config;

import com.techspring.spring.core.model.Bar;
import com.techspring.spring.core.model.Foo;
import com.techspring.spring.core.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

  @Bean
  @Scope("prototype")
  public Foo foo(){
      log.info("Create new foo");
      return new Foo();
  }

  @Bean
  public CustomScopeConfigurer customScopeConfigurer(){
      CustomScopeConfigurer custom = new CustomScopeConfigurer();
      custom.addScope("doubleton", new DoubletonScope());// custom.addScope("namaScope",ScopeYangDiBuat)
      return custom;
  }

  @Bean
  @Scope("doubleton") //nama scope yang baru
  public Bar bar(){
      log.info("Create new bar");
      return new Bar();
  }

}
