package com.techspring.spring.core.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicTest {
  
  private ApplicationContext context;

  @BeforeEach
  void setUp() {
      // context = new AnnotationConfigApplicationContext(BeanNameConfiguration.class); //supaya tidak inisialisasi awal tiap test
  }

  @Test
  void testCyclic(){

    //JIKA TERJADI CIRCULAR DEPENDENCY ATAU CYLIC
    Assertions.assertThrows(Throwable.class, () ->{
      context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
    });
  }
}
