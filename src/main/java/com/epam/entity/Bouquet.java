package com.epam.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Bouquet")
public class Bouquet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_BOUQUET")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private Long price;
    @Column(name = "AMOUNT")
    private long amount;
    @Column(name = "PHOTO")
    private String photo;




    public Bouquet() {
    }

    public Bouquet(Long id, String name, Long price, long amount, String photo, Set<Decoration> decoration, short decor_amount, Set<Flower> flower, short flower_amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }



    @Override
    public String toString() {
        return "Bouquet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", amount='" + amount + '\'' +
                ", photo='" + photo + '\'' +
                ", flower_amount='"  + '\'' +
                '}';
    }
}
