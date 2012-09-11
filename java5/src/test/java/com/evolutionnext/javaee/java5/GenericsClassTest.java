package com.evolutionnext.javaee.java5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;


public class GenericsClassTest {


    @Test
    public void testTypeChecking() {
        GenericClass genericClass = new GenericClass<String>();
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(12);
        integers.add(15);
        integers.add(19);
        //genericClass.<String>genericMethod(integers); //WRONG
        genericClass.method(integers); //type inference
    }

}
