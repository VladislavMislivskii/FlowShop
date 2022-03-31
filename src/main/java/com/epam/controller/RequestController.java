package com.epam.controller;

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
    public List<Request> getAll() {
        return requestService.getAll();
    }

    @PostMapping()
    public List<Request> create(@RequestBody Request request) {
        requestService.create(request);
        return requestService.list();

    }
}
