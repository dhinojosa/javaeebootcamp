package com.evolutionnext.javaee.java5;

public class GroceryBasketInvariant<E> {
    private E e;

    public GroceryBasketInvariant(E e) {
        this.e = e;
    }

    public void setItem(E e) {
        this.e = e;
    }

    public E getItem() {
        return e;
    }
}
