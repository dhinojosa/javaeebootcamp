package com.evolutionnext.javaee.java5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;


public class GenericsMethodTest {

    @Test
    public void testTypeChecking() {
        GenericMethod genericMethod = new GenericMethod();
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(12);
        integers.add(15);
        integers.add(19);
        //genericClass.<String>genericMethod(integers);
        genericMethod.method(integers); //type inference
    }

}
