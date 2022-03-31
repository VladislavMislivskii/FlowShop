package com.epam.dto;

import com.epam.entity.Client;

import java.io.Serializable;

public class ClientDTO implements Serializable {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String surname, String email, String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }

    public ClientDTO(Client client) {
        if (client == null) {
            throw new IllegalArgumentException();
        }
        this.id = client.getId();
        this.name = client.getName() + " " + client.getSurname();
        this.email = client.getEmail();
        this.phone = client.getPhone();
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