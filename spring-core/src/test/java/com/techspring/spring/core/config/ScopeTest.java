package com.techspring.spring.core.config;

import com.techspring.spring.core.model.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class ScopeTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void testScope(){

        //penggunaan @Scope("prototype") akan membuat object baru pada bean setiap kali bean di akses, sehingga kalau di cek dengan notSame, makan akan success
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Foo foo3 = context.getBean(Foo.class);

        Assertions.assertNotSame(foo1,foo2);
        Assertions.assertNotSame(foo1,foo3);
        Assertions.assertNotSame(foo2,foo3);
    }

}