package com.techspring.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import com.techspring.spring.core.model.Bar;
import com.techspring.spring.core.model.Foo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConfiguration {
  
  //COntoh dibawah secara default tidak berpengaruh satu sama lain sama sekali



  @Lazy // semua bean akan dibuat diawal sehinnga agak lama, namun bisa dibuat jika bean tersebut memang dibutuhkan dengan annotation @Lazy
  //coba pada test tanpa DependsOn, spring akan membuat dari atas dulu ke bawah, jika Bar diatas maka akan dibuat Bar terlbih dahulu;
  @Bean
  @DependsOn("bar") //mengutamakan pembuatan bar terlebih dahulu
  public Foo foo(){
    log.info("Create new Foo");
    return new Foo();
  }

  @Bean
  public Bar bar(){
    log.info("Create new Bar");
    return new Bar();
  }
}
