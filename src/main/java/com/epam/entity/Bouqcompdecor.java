package com.epam.entity;

import javax.persistence.*;

@Entity
@Table(name = "BOUQCOMPDECOR")
public class Bouqcompdecor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_BOUQCOMPDECOR")
    private Long id;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_BOUQUET")
    private Request bouquet;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_DECORATION")
    private Request decoration;

    @Column(name = "DECOR_AMOUNT")
    private Short decor_amount;



    public Bouqcompdecor() {
    }

    public Bouqcompdecor(Long id, Request bouquet, Request decoration, Short decor_amount) {
        this.id = id;
        this.bouquet = bouquet;
        this.decoration = decoration;
        this.decor_amount = decor_amount;
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
        return decoration;
    }

    public void setDecoration(Request id_decoration) {
        this.decoration = id_decoration;
    }

    public Short getDecor_amount() {
        return decor_amount;
    }

    public void setDecor_amount(Short decor_amount) {
        this.decor_amount = decor_amount;
    }

    @Override
    public String toString() {
        return "Bouqcompdecor{" +
                "id=" + id +
                ", ID_BOUQCOMPDECOR='" + bouquet + '\'' +
                ", decoration='" + decoration + '\'' +
                ", decor_amount='" + decor_amount + '\'' +
                '}';
    }
}
