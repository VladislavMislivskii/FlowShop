package com.epam.entity;

import javax.persistence.*;

@Entity
@Table(name = "BOUQCOMPFLOW")
public class Bouqcompflow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_BOUQCOMPFLOW")
    private Long id;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_BOUQUET")
    private Request bouquet;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="id_flower")
    private Request flower;

    @Column(name = "FLOWER_AMOUNT")
    private Short flower_amount;


    public Bouqcompflow() {
    }

    public Bouqcompflow(Long id, Request bouquet, Request flower, Short flower_amount) {
        this.id = id;
        this.bouquet = bouquet;
        this.flower = flower;
        this.flower_amount = flower_amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Request getBouquet() {
        return bouquet;
    }

    public void setBouquet(Request bouquet) {
        this.bouquet = bouquet;
    }

    public Request getDecoration() {
        return flower;
    }

    public void setDecoration(Request flower) {
        this.flower = flower;
    }

    public Short getFlower_amount() {
        return flower_amount;
    }

    public void setFlower_amount(Short flower_amount) {
        this.flower_amount = flower_amount;
    }

    @Override
    public String toString() {
        return "Bouqcompflow{" +
                "id=" + id +
                ", ID_BOUQCOMPFLOW='" + bouquet + '\'' +
                ", flower='" + flower + '\'' +
                ", flower_amount='" + flower_amount + '\'' +
                '}';
    }

}
