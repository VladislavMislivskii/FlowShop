package com.epam.controller;

import com.epam.dto.NewClientDTO;
import com.epam.dto.NewRequestDTO;
import com.epam.dto.RequestDTO;
import com.epam.dto.RequestForClientDTO;
import com.epam.entity.Request;
import com.epam.service.RequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/request")
public class RequestController {

    private final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping() //для администирование
    public List<RequestDTO> getAll() {
        return requestService.getAll();
    }

    @GetMapping(path ="/test") //для администирование
    public List<RequestForClientDTO> findByIdClient(@RequestBody NewClientDTO newClientDTO) {
        return requestService.findByIdClient(newClientDTO);
    }

    @PostMapping() //нужно отредачить
    public List<Request> create(@RequestBody NewRequestDTO newRequestDTO) {
        requestService.create(newRequestDTO);
        return requestService.lastItem();
    }
}
