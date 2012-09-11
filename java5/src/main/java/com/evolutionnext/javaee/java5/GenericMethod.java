package com.evolutionnext.javaee.java5;

import java.util.List;

public class GenericMethod {
    public <E> void method(List<E> e) {
        E e1 = e.get(3);
        //No other information can be told as it is an object
    }
}
