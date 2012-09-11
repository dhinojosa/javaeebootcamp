package com.evolutionnext.javaee.java5;

public class GroceryBasketCovariant<E extends Fruit> {
    private E e;

    public GroceryBasketCovariant(E e) {
        this.e = e;
    }

    public void setItem(E e) {
        this.e = e;
    }

    public E getItem() {
        return e;
    }
}
