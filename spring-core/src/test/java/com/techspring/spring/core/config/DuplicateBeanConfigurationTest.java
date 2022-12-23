package com.techspring.spring.core.config;

import com.techspring.spring.core.model.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateBeanConfigurationTest {


    @Test
    void duplicateBeanTest() {

        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);


        Assertions.assertThrows(NoUniqueBeanDefinitionException.class,() -> {
            Foo foo = context.getBean(Foo.class); //karena ada 2 nilai, maka akan error
        });

        Foo foo1 = context.getBean("foo1", Foo.class); //definisikan 1
        Foo foo2 = context.getBean("foo2", Foo.class); //definisikan 2

        Assertions.assertNotSame(foo1, foo2);

        Foo foo3 = context.getBean("foo1", Foo.class); //sama dengan foo1 karena foo3 memiliki nilai foo1
        Assertions.assertSame(foo1, foo3);

        Foo foo4 = context.getBean("foo2", Foo.class);//sama
        Assertions.assertSame(foo2, foo4);

    }

    @Test
    void primaryBeanTest() {

        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        Foo foo1 = context.getBean(Foo.class); //karena foo1 sudah @primary otomatis diambil
        Foo foo2 = context.getBean("foo1", Foo.class);

        Assertions.assertSame(foo1,foo2);

        Foo foo3 = context.getBean("foo2", Foo.class);
        Assertions.assertNotSame(foo1,foo3);
    }
}