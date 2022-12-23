package com.techspring.spring.core.config;

import com.techspring.spring.core.model.Bar;
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
    void testPrototypeScope(){

        //penggunaan @Scope("prototype") akan membuat object baru pada bean setiap kali bean di akses, sehingga kalau di cek dengan notSame, makan akan success
        //namun jika pada @Scope diubah menjadi singleton maka test akan error, karena hanya dibuat sekali dalam spring IoC
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Foo foo3 = context.getBean(Foo.class);

        Assertions.assertNotSame(foo1,foo2);
        Assertions.assertNotSame(foo1,foo3);
        Assertions.assertNotSame(foo2,foo3);
    }

    @Test
    void testDoubletonScope(){
        Bar bar1 = context.getBean(Bar.class);
        Bar bar2 = context.getBean(Bar.class);
        Bar bar3 = context.getBean(Bar.class);//seperti yang dilakukan pada counter di scope, ini seharusnya nilainya sama seperti di bar1 atau kembali ke bar1
        Bar bar4 = context.getBean(Bar.class);//ini juga kembali ke bar2

        Assertions.assertSame(bar1,bar3);//ini seharusnya nilainya sama
        Assertions.assertSame(bar2,bar4);//sama
        Assertions.assertNotSame(bar1,bar2);//nilainya tidak sama
        Assertions.assertNotSame(bar3,bar4);//tidak sama
    }

}