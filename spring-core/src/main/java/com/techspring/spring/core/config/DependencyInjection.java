package com.techspring.spring.core.config;

import com.techspring.spring.core.model.*;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjection {
    @Bean
    public Foo fooFirst(){
        return new Foo();
    }

    @Bean
    public Foo fooSecond(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    //DENGAN DEPENDENCY INJECTION
    @Bean
    //@Qualifier berfungsi untuk memilih bean dengan nama valuenya (karena ada 2 Foo)
    public FooBar fooBar(@Qualifier("fooSecond")Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }

    @Bean
    public Product product(){
        return new Product();
    }

    @Bean
    public Category category(){
        return new Category();
    }

    //DENGAN DEPENDENCY INJECTION
    @Bean
    public ProductCategory productCategory(Product product,Category category){
        return new ProductCategory(product, category);
    }


}
