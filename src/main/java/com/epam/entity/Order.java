package com.epam.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ORDER")
    private Long id;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_ORDSTATUS")
    private OrdStatus ordStatus;

    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_REQUEST")
    private Request request;

    @Column(name = "COLLECTION_DATE")
    private Date collection_date;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ORDERCOL",
            joinColumns = @JoinColumn(name = "ID_ORDER"),
            inverseJoinColumns = @JoinColumn(name = "ID_EMPLOYEE"))
    private Set<Employee> employee;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ROUTEORDERS",
            joinColumns = @JoinColumn(name = "ID_ORDER"),
            inverseJoinColumns = @JoinColumn(name = "ID_EMPLOYEE"))
    private Set<Route> route;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordStatus='" + ordStatus + '\'' +
                ", request='" + request + '\'' +
                ", collection_date='" + collection_date + '\'' +
                ", employee='" + employee + '\'' +
                ", route='" + route + '\'' +
                '}';
    }

    public Order() {
    }

    public Order(Long id, OrdStatus ordStatus, Request request, Date collection_date, Set<Employee> employee, Set<Route> route) {
        this.id = id;
        this.ordStatus = ordStatus;
        this.request = request;
        this.collection_date = collection_date;
        this.employee = employee;
        this.route = route;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrdStatus getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(OrdStatus ordStatus) {
        this.ordStatus = ordStatus;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Date getCollection_date() {
        return collection_date;
    }

    public void setCollection_date(Date collection_date) {
        this.collection_date = collection_date;
    }

    public Set<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    public Set<Route> getRoute() {
        return route;
    }

    public void setRoute(Set<Route> route) {
        this.route = route;
    }
}
