package com.evolutionnext.javaee.java5;

import org.junit.Test;

public class GenericsCovariantTest {

//    @Test
//    public void testInvariant() {
//        GroceryBasketInvariant<Object> groceryBasketUnbounded = new GroceryBasketInvariant<Object>(new Object());
//        groceryBasketUnbounded.setItem(new Apple());
//    }
//
//    @Test
//    public void testCovariance() {
//        GroceryBasketCovariant<? super Citrus> groceryBasketCovariant = new GroceryBasketCovariant<Fruit>(new Orange());
//        groceryBasketCovariant.setItem(new Tangelo());
//        groceryBasketCovariant.setItem(new Orange());
//        groceryBasketCovariant.setItem(new Fruit());
//        groceryBasketCovariant.getItem();
//
//        GroceryBasketCovariant<? extends Citrus> groceryBasketCovariant2 = new GroceryBasketCovariant<Orange>(new Orange());
//        groceryBasketCovariant2.setItem(new Tangelo());
//        groceryBasketCovariant2.setItem(new Orange());
//        groceryBasketCovariant2.setItem(new Fruit());
//        groceryBasketCovariant2.getItem();
////        groceryBasketCovariant.setItem(new Fruit());
//
//        //groceryBasketCovariant.setItem(new Object());  //cannot since objects aren't apples
//    }

//    @Test
//    public void testCovariance3() {
//        GroceryBasketCovariant<? extends Apple> groceryBasketCovariant = new GroceryBasketCovariant<Apple>();
//        groceryBasketCovariant.setItem(new Apple());
//    }
//
//
//    @Test
//    public void testCovariance4() {
//        GroceryBasketCovariant<?> groceryBasketCovariant = new GroceryBasketCovariant<Apple>();
////        groceryBasketCovariant.setItem(new Fruit());
//    }


//    @Test
//    public void testCovariance5() {
//        List<? super Number> listz = new ArrayList<Number>();
//        listz.add(13);
//        listz.get(0);
//    }
//
//    @Test
//    public void testCovariance5() {
//        List<? super Number> listz = new ArrayList<Number>();
//        listz.add(13);
//        listz.get(0);
//    }
//
//    @Test
//    public void testCovariance2() {
//        GroceryBasketCovariant<Fruit> groceryBasketCovariant2 = new GroceryBasketCovariant<Fruit>();
//        groceryBasketCovariant2.setItem(new Apple());
//        groceryBasketCovariant2.getItem();
//
//        GroceryBasketCovariant<? extends Fruit> groceryBasketCovariant = new GroceryBasketCovariant<Fruit>();
////        groceryBasketCovariant.setItem(new Apple());
//        groceryBasketCovariant.getItem();
//
//        GroceryBasketCovariant<? super Fruit> groceryBasketCovariant3 = new GroceryBasketCovariant<Fruit>();
//        groceryBasketCovariant3.setItem(new Apple());
//        groceryBasketCovariant3.getItem();
//    }
}
