package com.epam.entity;

import javax.persistence.*;

@Entity
@Table(name = "COURTYPE")
public class CourType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COURTYPE")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "MAX_RANGE")
    private int max_range;

    public CourType(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CourType() {
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

    public int getMax_range() {
        return max_range;
    }

    public void setMax_range(int max_range) {
        this.max_range = max_range;
    }

    @Override
    public String toString() {
        return "COURTYPE {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", max_range='" + max_range + '\'' +
                '}';
    }
}
