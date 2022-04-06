package com.epam.service;

import com.epam.dto.*;
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
        requestRepository.save(ConvertManager.convert(newRequestDTO));
    }
    public boolean updateStatus(long id, UpdateReqStatusDTO updateReqStatusDTO){
        Request request = requestRepository.findById(id);
        if (request != null) {
            request.setReqStatus(ConvertManager.convert(updateReqStatusDTO));
            requestRepository.save(request);
            return true;
        }
        return false;
    }

    public List<RequestForClientDTO> findByIdClient(NewClientDTO newClientDTO) {
        Iterable<Request> queryResult = requestRepository.findByClient(ConvertManager.convert(newClientDTO));
        return StreamSupport.stream(queryResult.spliterator(), false)
                .map(RequestForClientDTO::new)
                .collect(Collectors.toList());
    }
}