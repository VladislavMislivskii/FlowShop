package com.epam.entity;
import javax.persistence.*;

@Entity
@Table(name = "Reqproduct")
public class Reqproduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_REQPRODUCT")
    private Long id;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_REQUEST")
    private Request request;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_PRODUCT")
    private Request product;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_CATEGORY")
    private Request category;

    @Column(name = "AMOUNT")
    private Short amount;

    public Reqproduct() {
    }

    public Reqproduct(Long id, Request request, Request product, Request category, Short amount) {
        this.id = id;
        this.request = request;
        this.product = product;
        this.category = category;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Request getProduct() {
        return product;
    }

    public void setProduct(Request product) {
        this.product = product;
    }

    public Request getCategory() {
        return category;
    }

    public void setCategory(Request category) {
        this.category = category;
    }

    public Short getAmount() {
        return amount;
    }

    public void setAmount(Short amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Reqproduct{" +
                "id=" + id +
                ", request='" + request + '\'' +
                ", product='" + product + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
