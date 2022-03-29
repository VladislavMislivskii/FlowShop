package com.epam.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_REQUEST")
    private Long id;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_CLIENT")
    private Client client;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_Req_Status")
    private ReqStatus reqStatus;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "SHIPPING_COST")
    private long shipping_cost;
    @Column(name = "COST")
    private long cost;
    @Column(name = "PAID")
    private boolean paid;
    @Column(name = "DELIVERY_TIME")
    private Date delivery_time;


    public Request() {
    }

    public Request(Long id, Client client, ReqStatus reqStatus, String address, Long shipping_cost, Long cost, Boolean paid, Date delivery_time) {
        this.id = id;
        this.client = client;
        this.reqStatus = reqStatus;
        this.address = address;
        this.shipping_cost = shipping_cost;
        this.cost = cost;
        this.paid = paid;
        this.delivery_time = delivery_time;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ReqStatus getReqStatus() {
        return reqStatus;
    }

    public void setReqStatus(ReqStatus reqStatus) {
        this.reqStatus = reqStatus;
    }

    public Date getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(Date delivery_time) {
        this.delivery_time = delivery_time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getShipping_cost() {
        return shipping_cost;
    }

    public void setShipping_cost(Long shipping_cost) {
        this.shipping_cost = shipping_cost;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public Boolean getPaid() { return paid; }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }



    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", client='" + client + '\'' +
                ", reqStatus ='" + reqStatus + '\'' +
                ", address='" + address + '\'' +
                ", shipping_cost='" + shipping_cost + '\'' +
                ", cost ='" + cost + '\'' +
                ", paid ='" + paid + '\'' +
                ", delivery_time ='" + delivery_time + '\'' +
                '}';
    }
}

