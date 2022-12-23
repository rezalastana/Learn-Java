package com.techspring.spring.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FooBar {
    // CONTOH DEPENDECY INJECTION
    private Foo foo;
    private Bar bar;
}
