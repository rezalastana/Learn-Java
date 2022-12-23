package com.techspring.spring.core.config;

import com.techspring.spring.core.model.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class BeanNameConfigurationTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(BeanNameConfiguration.class); //supaya tidak inisialisasi awal tiap test
    }

    @Test
    void testBeanName(){
        Foo foo = context.getBean(Foo.class);
        Foo foo1 = context.getBean("fooFirst", Foo.class);
        Foo foo2 = context.getBean("fooSecond", Foo.class);

        Assertions.assertSame(foo,foo1);
        Assertions.assertNotSame(foo1,foo2);
        Assertions.assertNotSame(foo,foo2);

    }

}