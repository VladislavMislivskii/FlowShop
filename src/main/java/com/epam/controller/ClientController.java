package com.epam.controller;

import com.epam.dto.ClientDTO;
import com.epam.dto.NewClientDTO;
import com.epam.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping()
    public List<ClientDTO> getAll() {
        return clientService.getAll();
    }

    @PostMapping()
    public void  create(@RequestBody NewClientDTO newClientDTO) {
        clientService.create(newClientDTO);
    }
}
