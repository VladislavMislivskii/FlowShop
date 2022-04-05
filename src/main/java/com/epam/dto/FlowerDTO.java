package com.epam.dto;

import com.epam.entity.Flower;

import java.io.Serializable;

public class FlowerDTO implements Serializable {
    private long id;
    private String name;
    private double price;
    private short amount;
    private String photo;

    public FlowerDTO(long id, String name, double price, short amount, String photo) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.photo = photo;
    }

    public FlowerDTO(Flower flower) {
        if (flower == null) {
            throw new IllegalArgumentException();
        }
        this.id = flower.getId();
        this.name = flower.getName();
        this.price = flower.getPrice();
        this.amount = flower.getAmount();
        this.photo = flower.getPhoto();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public short getAmount() {
        return amount;
    }

    public void setAmount(short amount) {
        this.amount = amount;
    }
}