package com.epam.entity;

import javax.persistence.*;

@Entity
@Table(name = "DECORATION")
public class Decoration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DECORATION")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "AMOUNT")
    private long amount;


    public Decoration() {
    }

    public Decoration(Long id, String name, Long price, Long amount) {
        this.id = id;
        this.name = name;
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


    public Long getAmount() { return amount; }

    public void setAmount(Long amount) { this.amount = amount;}


    @Override
    public String toString() {
        return "Decoration{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
