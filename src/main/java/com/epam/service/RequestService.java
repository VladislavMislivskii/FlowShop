package com.epam.service;


import com.epam.dto.NewClientDTO;
import com.epam.dto.NewRequestDTO;
import com.epam.dto.RequestDTO;
import com.epam.dto.RequestForClientDTO;
import com.epam.entity.Request;
import com.epam.repository.RequestRepository;
import com.epam.util.ConvertManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class RequestService {
    private final RequestRepository requestRepository;

    @Autowired
    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public List<RequestDTO> getAll() {
        Iterable<Request> queryResult = requestRepository.findAll();
        return StreamSupport.stream(queryResult.spliterator(), false)
                .map(RequestDTO::new)
                .collect(Collectors.toList());
    }

    public void create(NewRequestDTO newRequestDTO) {
        requestRepository.save(ConvertManager.convert(newRequestDTO)).getId();
    }

    public List<RequestForClientDTO> findByIdClient(NewClientDTO newClientDTO) {
        Iterable<Request> queryResult = requestRepository.findByClient(ConvertManager.convert(newClientDTO));
        return StreamSupport.stream(queryResult.spliterator(), false)
                .map(RequestForClientDTO::new)
                .collect(Collectors.toList());
    }

    public List<Request> lastItem() {
        return (List<Request>) requestRepository.findFirstByOrderByIdDesc();
    }
}