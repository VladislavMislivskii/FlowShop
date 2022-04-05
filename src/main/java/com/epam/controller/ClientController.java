package com.epam.controller;

import com.epam.dto.ClientDTO;
import com.epam.dto.NewClientDTO;
import com.epam.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping() //отредачить потом (Администирование)
    public List<ClientDTO> getAll() {
        return clientService.getAll();
    }

    @PostMapping(path="/Registration")
    public boolean  create(@RequestBody NewClientDTO newClientDTO) {
        return clientService.create(newClientDTO);
    }
}
