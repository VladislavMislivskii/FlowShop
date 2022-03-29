package com.epam.entity;

import javax.persistence.*;

@Entity
@Table(name = "Transport")
public class Transport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TRANSPORT")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "REG_MARK")
    private String reg_mark;
    @Column(name = "CAPACITY")
    private short capacity;
    @Column(name = "TYPE ")
    private String type;

    public Transport() {
    }

    public Transport(Long id, String name, String model, String reg_mark, short capacity, String type) {
        this.id = id;
        this.name = name;
        model = model;
        this.reg_mark = reg_mark;
        this.capacity = capacity;
        this.type = type;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        model = model;
    }

    public String getReg_mark() {
        return reg_mark;
    }

    public void setReg_mark(String reg_mark) {
        this.reg_mark = reg_mark;
    }

    public short getCapacity() {
        return capacity;
    }

    public void setCapacity(short capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Transport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", reg_mark='" + reg_mark + '\'' +
                ", capacity='" + capacity + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
