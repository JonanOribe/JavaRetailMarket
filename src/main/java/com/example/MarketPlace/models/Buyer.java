package com.example.MarketPlace.models;

import java.util.Date;

public class Buyer extends User{
    private int shopping_cart;

    public Buyer() {
    }

    public Buyer(String name, String phone, String email, Date birthday, int userType, int shopping_cart) {
        super(name, phone, email, birthday, userType);
        this.shopping_cart = shopping_cart;
    }

    public int getShopping_cart() {
        return shopping_cart;
    }

    public void setShopping_cart(int shopping_cart) {
        this.shopping_cart = shopping_cart;
    }
}
