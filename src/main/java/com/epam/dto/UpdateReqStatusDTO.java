package com.epam.dto;

public class UpdateReqStatusDTO {
    private long id;
    private String status;
    private String comment;


    public UpdateReqStatusDTO() {
    }

    public UpdateReqStatusDTO(long id, String status, String comment) {
        this.id = id;
        this.status = status;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
