package com.epam.entity;

import javax.persistence.*;
import java.awt.*;
import java.nio.file.Path;

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
    private Long price;
    @Column(name = "AMOUNT")
    private long amount;


    public Flower() {
    }

    public Flower(Long id, String name, Long price, Long amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;

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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getAmount() { return amount; }

    public void setAmount(Long amount) { this.amount = amount;}


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
