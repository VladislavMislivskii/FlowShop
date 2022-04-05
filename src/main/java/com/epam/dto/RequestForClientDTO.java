package com.epam.dto;

import com.epam.entity.Request;

import java.util.Date;


public class RequestForClientDTO {

    private ReqStatusDTO reqStatusDTO;
    private String address;
    private long shipping_cost;
    private long cost;
    private boolean paid;
    private Date delivery_time;


    public RequestForClientDTO() {
    }

    public RequestForClientDTO(ReqStatusDTO reqStatusDTO, String address, long shipping_cost, long cost, boolean paid, Date delivery_time) {
        this.reqStatusDTO = reqStatusDTO;
        this.address = address;
        this.shipping_cost = shipping_cost;
        this.cost = cost;
        this.paid = paid;
        this.delivery_time = delivery_time;
    }

    public RequestForClientDTO(Request request) {
        if (request == null) {
            throw new IllegalArgumentException();
        }
        this.reqStatusDTO = new ReqStatusDTO(request.getReqStatus());
        this.address = request.getAddress();
        this.shipping_cost = request.getShipping_cost();
        this.cost = request.getCost();
        this.paid = request.getPaid();
        this.delivery_time = request.getDelivery_time();
    }

    public ReqStatusDTO getReqStatusDTO() {
        return reqStatusDTO;
    }

    public void setReqStatusDTO(ReqStatusDTO reqStatusDTO) {
        this.reqStatusDTO = reqStatusDTO;
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

