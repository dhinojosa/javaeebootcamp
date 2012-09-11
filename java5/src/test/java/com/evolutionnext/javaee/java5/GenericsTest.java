package com.evolutionnext.javaee.java5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;


public class GenericsTest {

    @Test
    public void testGenerics() {
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        assertThat(list).hasSize(3);
    }

    @Test
    public void testErasure() {
        List<String> list = new ArrayList<String>();
        List list2 = list;
        List<String> list3 = list2;
        assertThat(list3.getClass().getSimpleName()).isEqualTo("ArrayList");
    }
}
