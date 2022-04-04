package com.epam.dto;

import java.util.Date;


public class NewRequestDTO {

    private Long id;
    private long clientId;
    private long reqStatusId;
    private String address;
    private long shipping_cost;
    private long cost;
    private boolean paid;
    private Date delivery_time;

    public NewRequestDTO(){

    }

    public NewRequestDTO(Long id, long clientId, long reqStatusId, String address, long shipping_cost, long cost, boolean paid, Date delivery_time) {
        this.id = id;
        this.clientId = clientId;
        this.reqStatusId = reqStatusId;
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

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getReqStatusId() {
        return reqStatusId;
    }

    public void setReqStatusId(long reqStatusId) {
        this.reqStatusId = reqStatusId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getShipping_cost() {
        return shipping_cost;
    }

    public void setShipping_cost(long shipping_cost) {
        this.shipping_cost = shipping_cost;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Date getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(Date delivery_time) {
        this.delivery_time = delivery_time;
    }
}

