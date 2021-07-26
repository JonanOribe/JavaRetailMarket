package com.example.MarketPlace.models;

public class Review {
    private String title;
    private String content;
    private int author;
    private int product;

    public Review() {
    }

    public Review(String title, String content, int author, int product) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.product = product;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }
}
