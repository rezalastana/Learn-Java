package com.techspring.spring.core.config;

import com.techspring.spring.core.model.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanNameConfiguration {

    @Primary //nilai primary menjadi utama, otomatis akan mengambil nilai @Primary
    @Bean(name = "fooFirst")//value digunakan untuk mengubah nama bean
    public Foo foo1(){//sehingga nama method sudah tidak dapat dipakai
        return new Foo();
    }

    @Bean(name = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }
}
