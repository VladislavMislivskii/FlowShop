package com.epam.entity;

import javax.persistence.*;

@Entity
@Table(name = "COURIER")
public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COURIER")
    private Long id;

    @Column(name = "STATUS")
    private String status;

    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_EMPLOYEE")
    private Employee employee;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name="ID_COURTYPE")
    private CourType CourType;

    public Courier() {
    }

    public Courier(Long id, String status, Employee employee, com.epam.entity.CourType courType) {
        this.id = id;
        this.status = status;
        this.employee = employee;
        CourType = courType;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public com.epam.entity.CourType getCourType() {
        return CourType;
    }

    public void setCourType(com.epam.entity.CourType courType) {
        CourType = courType;
    }
    @Override
    public String toString() {
        return "Courier{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", Employee='" + employee + '\'' +
                ", CourType='" + CourType + '\'' +
                '}';
    }
}
