package com.epam.controller;

import com.epam.dto.*;
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

    @PostMapping() //возврат работал конченно
    public void create(@RequestBody NewRequestDTO newRequestDTO) {
        requestService.create(newRequestDTO);
    }

    @PutMapping(path ="/{id}") //работает
    public boolean Update(@PathVariable(value = "id") Long IdRequest, @RequestBody UpdateReqStatusDTO updateReqStatusDTO) {
        return requestService.updateStatus(IdRequest,updateReqStatusDTO);
    }
}
