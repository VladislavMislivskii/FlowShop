package com.epam.dto;

import com.epam.entity.ReqStatus;

public class ReqStatusDTO {
    private String status;
    private String comment;


    public ReqStatusDTO() {
    }

    public ReqStatusDTO(String status, String comment) {
        this.status = status;
        this.comment = comment;
    }
    public ReqStatusDTO(ReqStatus reqStatus) {
        this.status = reqStatus.getStatus();
        this.comment = reqStatus.getComment();
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
