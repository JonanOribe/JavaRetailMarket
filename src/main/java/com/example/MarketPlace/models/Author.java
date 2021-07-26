package com.example.MarketPlace.models;

import java.util.Date;

public class Author extends User{
    private int[] reviews;

    public Author() {
    }

    public Author(String name, String phone, String email, Date birthday, int userType, int[] reviews) {
        super(name, phone, email, birthday, userType);
        this.reviews = reviews;
    }

    public int[] getReviews() {
        return reviews;
    }

    public void setReviews(int[] reviews) {
        this.reviews = reviews;
    }
}
