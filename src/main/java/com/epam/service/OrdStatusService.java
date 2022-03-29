package com.epam.service;

import com.epam.entity.OrdStatus;
import com.epam.repository.OrdStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class OrdStatusService {
    private final OrdStatusRepository ordStatusRepository;

    @Autowired
    public OrdStatusService(OrdStatusRepository ordStatusRepository) {
        this.ordStatusRepository = ordStatusRepository;
    }

    public  List<OrdStatus> getAll() {
        Iterable<OrdStatus> queryResult = ordStatusRepository.findAll();
        return StreamSupport.stream(queryResult.spliterator(), false)
                .collect(Collectors.toList());
    }
}
