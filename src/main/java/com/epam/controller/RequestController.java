package com.epam.controller;

import com.epam.dto.NewRequestDTO;
import com.epam.dto.RequestDTO;
import com.epam.entity.Request;
import com.epam.service.RequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requests")
public class RequestController {

    private final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping()
    public List<RequestDTO> getAll() {
        return requestService.getAll();
    }

    @PostMapping()
    public List<Request> create(@RequestBody NewRequestDTO newRequestDTO) {
        requestService.create(newRequestDTO);
        return requestService.lastItem();
    }
}
