package com.epam.dto;

import com.epam.entity.Request;

import java.util.Date;


public class RequestDTO {

    private Long id;
    private ClientDTO clientDTO;
    private ReqStatusDTO reqStatusDTO;
    private String address;
    private long shipping_cost;
    private long cost;
    private boolean paid;
    private Date delivery_time;


    public RequestDTO() {
    }

    public RequestDTO(Long id, ClientDTO clientDTO, ReqStatusDTO reqStatusDTO, String address, long shipping_cost, long cost, boolean paid, Date delivery_time) {
        this.id = id;
        this.clientDTO = clientDTO;
        this.reqStatusDTO = reqStatusDTO;
        this.address = address;
        this.shipping_cost = shipping_cost;
        this.cost = cost;
        this.paid = paid;
        this.delivery_time = delivery_time;
    }

    public RequestDTO(Request request) {
        if (request == null) {
            throw new IllegalArgumentException();
        }
        this.id = request.getId();
        this.clientDTO = new ClientDTO(request.getClient());
        this.reqStatusDTO = new ReqStatusDTO(request.getReqStatus());
        this.address = request.getAddress();
        this.shipping_cost = request.getShipping_cost();
        this.cost = request.getCost();
        this.paid = request.getPaid();
        this.delivery_time = request.getDelivery_time();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClientDTO getClientDTO() {
        return clientDTO;
    }

    public void setClientDTO(ClientDTO clientDTO) {
        this.clientDTO = clientDTO;
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

