package com.epam.service;

import com.epam.dto.ClientDTO;
import com.epam.dto.NewClientDTO;
import com.epam.entity.Client;
import com.epam.repository.ClientRepository;
import com.epam.util.ConvertManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<ClientDTO> getAll() {
        Iterable<Client> queryResult = clientRepository.findAll();
        return StreamSupport.stream(queryResult.spliterator(), false)
                .map(ClientDTO::new)
                .collect(Collectors.toList());
    }


    public void create(NewClientDTO newClientDTO) {
         clientRepository.save(ConvertManager.convert(newClientDTO)).getId();
    }

}
