package com.epam.entity;

import javax.persistence.*;

@Entity
@Table(name = "Flower")
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FLOWER")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "AMOUNT")
    private short amount;
    @Column(name = "PHOTO")
    private String photo;


    public Flower() {
    }

    public Flower(Long id, String name, double price, short amount, String photo) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.photo = photo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public short getAmount() { return amount; }

    public void setAmount(short amount) { this.amount = amount;}


    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
