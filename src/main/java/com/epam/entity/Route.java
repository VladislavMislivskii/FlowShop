package com.epam.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ROUTE")
    private Long id;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_COURIER")
    private Courier courier;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_TRANSPORT")
    private Transport transport;
    @Column(name = "DATE_DEPARTURE")
    private Date date_departure;
    @Column(name = "DATE_ARRIVAL")
    private Date date_arrival;

    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", courier='" + courier + '\'' +
                ", transport='" + transport + '\'' +
                ", date_departure='" + date_departure + '\'' +
                ", date_arrival='" + date_arrival + '\'' +
                '}';
    }

    public Route(Long id, Courier courier, Transport transport, Date date_departure, Date date_arrival) {
        this.id = id;
        this.courier = courier;
        this.transport = transport;
        this.date_departure = date_departure;
        this.date_arrival = date_arrival;
    }
    public Route() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Date getDate_departure() {
        return date_departure;
    }

    public void setDate_departure(Date date_departure) {
        this.date_departure = date_departure;
    }

    public Date getDate_arrival() {
        return date_arrival;
    }

    public void setDate_arrival(Date date_arrival) {
        this.date_arrival = date_arrival;
    }
}

