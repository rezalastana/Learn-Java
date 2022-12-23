package com.techspring.spring.core.config;

import com.techspring.spring.core.model.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {

  private ApplicationContext context;

  @BeforeEach
  void setUp(){
    context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
  }

  @Test
  void testDependsOn(){
    //jika dijalankan disini maka akan menjalankan create new Foo dulu baru create new Bar //tanap dependsOn
    //ketika menggunakan @Lazy maka foo tidak akan dibuat.

    //namun ketika kita inisialisasikan (butuh) dari Foo, maka dia akan dibuat
    Foo foo = context.getBean(Foo.class);
  }
  
}
