package com.techspring.spring.core.config;

import com.techspring.spring.core.model.*;

import java.beans.Transient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class DependencyInjectionTest {

    private static ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(DependencyInjection.class);
    }

    @Test
    void testNoDI(){
        //No Depedency Injection
        var foo = new Foo();
        var bar = new Bar();

        var fooBar = new FooBar(foo, bar);

        Assertions.assertSame(foo, fooBar.getFoo());
        Assertions.assertSame(bar, fooBar.getBar());
    }

    @Test
    void testWithDI(){
        //DENGAN DEPENDENCY INJECTION
        //JIKA MENGGUNAKAN @Qualifier, TAMBAHKAN NAMA BEAN-NYA
        Foo foo = context.getBean("fooSecond",Foo.class);
        Bar bar = context.getBean(Bar.class);
        FooBar foobar = context.getBean(FooBar.class);

        Assertions.assertSame(foo, foobar.getFoo());
        Assertions.assertSame(bar, foobar.getBar());
    }

    @Test
    void productCategoryTest(){
        Product product = context.getBean(Product.class);
        Category category = context.getBean(Category.class);
        ProductCategory productCategory = context.getBean(ProductCategory.class);

        Assertions.assertSame(product, productCategory.getProduct());
        Assertions.assertSame(category, productCategory.getCategory());
    }
}