package com.example.JavaRetailMarket.models;

public class Product {
    private String name;
    private int producer;
    private String serial_number;
    private int reviewCode;

    public Product() {
    }

    public Product(String name, int producer, String serial_number, int reviewCode) {
        this.name = name;
        this.producer = producer;
        this.serial_number = serial_number;
        this.reviewCode = reviewCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProducer() {
        return producer;
    }

    public void setProducer(int producer) {
        this.producer = producer;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public int getReviewCode() {
        return reviewCode;
    }

    public void setReviewCode(int reviewCode) {
        this.reviewCode = reviewCode;
    }
}
