package com.evolutionnext.javaee.java5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;


public class GenericsStaticMethodTest {


    @Test
    public void testTypeChecking() {
        GenericStaticMethod genericStaticMethod = new GenericStaticMethod();
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(12);
        integers.add(15);
        integers.add(19);
        GenericStaticMethod.method(integers); //type inference
        GenericStaticMethod.<Integer>method(integers); //explicit type declaration
    }

}
