package com.techspring.spring.core.config;

import com.techspring.spring.core.model.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class PrimaryConfigurationTest {

    @Test
    void primaryTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);

        Foo foo = context.getBean(Foo.class); //tidak akan error karena Foo nya punya primary bean
        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertSame(foo,foo1);
        Assertions.assertNotSame(foo1,foo2);
        Assertions.assertNotSame(foo,foo2);
    }

}