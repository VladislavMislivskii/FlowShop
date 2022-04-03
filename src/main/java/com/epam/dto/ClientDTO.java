package com.epam.dto;

import com.epam.entity.Client;

import java.io.Serializable;

public class ClientDTO implements Serializable {
    private String name;
    private String email;
    private String phone;

    public ClientDTO() {
    }

    public ClientDTO( String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public ClientDTO(Client client) {
        if (client == null) {
            throw new IllegalArgumentException();
        }
        if (client.getSurname() != null) {
            this.name = client.getName() + " " + client.getSurname();
        }
        else {
            this.name = client.getName();
        }
        this.email = client.getEmail();
        this.phone = client.getPhone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
