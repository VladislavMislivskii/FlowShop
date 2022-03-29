package com.epam.entity;

import javax.persistence.*;

@Entity
@Table(name = "Position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_POSITION")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "COMMENT")
    private String сomment;


    public Position() {
    }

    public Position(Long id, String name, String сomment) {
        this.id = id;
        this.name = name;
        this.сomment = сomment;
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

    public String getСomment() {
        return сomment;
    }

    public void setСomment(String сomment) {
        this.сomment = сomment;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", сomment='" + сomment + '\''+
                '}';
    }
}
