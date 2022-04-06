package com.epam.controller;

import com.epam.dto.ReqStatusDTO;
import com.epam.service.ReqStatusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reqStatus")
public class ReqStatusController {
    private final ReqStatusService reqStatusService;

    public ReqStatusController(ReqStatusService reqStatusService) {
        this.reqStatusService = reqStatusService;
    }

    @GetMapping() //для администирование
    public List<ReqStatusDTO> getAll() {
        return reqStatusService.getAll();
    }
}
