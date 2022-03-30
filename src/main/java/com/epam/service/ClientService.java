package com.epam.service;

import com.epam.entity.Client;
import com.epam.repository.ClientRepository;
import com.epam.util.ConvertManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAll() {
        Iterable<Client> queryResult = clientRepository.findAll();
        return StreamSupport.stream(queryResult.spliterator(), false)
                .collect(Collectors.toList());
    }

    public void create(Client client) {
        clientRepository.save(client);
    }

    public List<Client> list() {
        return (List<Client>) clientRepository.findAll();
    }
}
