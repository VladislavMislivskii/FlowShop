package com.epam.entity;

import javax.persistence.*;

@Entity
@Table(name = "REQSTATUS")
public class ReqStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Req_Status")
    private Long id;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "COMMENT")
    private String comment;


    public ReqStatus() {
    }

    public ReqStatus(Long id, String name, String comment) {
        this.id = id;
        this.status = status;
        this.comment = comment;

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


    public String getComment() { return comment; }

    public void setComment(String comment) { this.comment = comment;}


    @Override
    public String toString() {
        return "ReqStatus{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
