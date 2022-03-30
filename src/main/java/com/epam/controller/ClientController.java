package com.epam.controller;

import com.epam.dto.NewClientDTO;
import com.epam.entity.Client;
import com.epam.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @PostMapping()
    public List<Client> create(@RequestBody Client client) {
        clientService.create(client);
        return clientService.list();

    }
}
