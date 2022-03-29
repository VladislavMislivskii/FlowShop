package com.epam.entity;

import javax.persistence.*;


@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EMPLOYEE")
    private Long id;
    @Column(name = "FNAME")
    private String name;
    @Column(name = "LNAME")
    private String surname;
    @Column(name = "PNAME")
    private String middlename;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "BONUS_POINTS")
    private int bonus_points;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_POSITION")
    private Position position;

    public Employee() {
    }

    public Employee(Long id, String name, String surname, String middlename, String password, int bonus_points, Position position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.password = password;
        this.bonus_points = bonus_points;
        this.position = position;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBonus_points() {
        return bonus_points;
    }

    public void setBonus_points(int bonus_points) {
        this.bonus_points = bonus_points;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return "Emloyee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", PNAME='" + middlename + '\'' +
                ", middlename='" + middlename + '\'' +
                ", BONUS_POINTS='" + bonus_points + '\'' +
                ", Position='" + position + '\'' +
                '}';
    }
}
