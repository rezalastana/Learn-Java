package com.techspring.spring.core.config;

import com.techspring.spring.core.model.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DuplicateBeanConfiguration {

//    @Primary  //primary bean
    @Bean //jika duplicate maka tidak boleh dengan nama yang sama
    public Foo foo1(){
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
