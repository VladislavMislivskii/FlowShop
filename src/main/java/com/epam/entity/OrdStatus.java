package com.epam.entity;

import javax.persistence.*;

@Entity
@Table(name = "ORDSTATUS")
public class OrdStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORDSTATUS")
    private Long id;

    @Column(name = "STATUS")
    private String status;

    public OrdStatus() {
    }

    public OrdStatus(Long id, String status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ordStatus{" +
                "id=" + id +
                ", STATUS='" + status + '\'' +
                '}';
    }
}
