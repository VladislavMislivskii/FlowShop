package com.epam.service;

import com.epam.entity.Bouqcompflow;
import com.epam.repository.BouqcompflowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BouqcompflowService {
    private final BouqcompflowRepository bouqcompflowRepository;

    @Autowired
    public BouqcompflowService(BouqcompflowRepository bouqcompflowRepository) {
        this.bouqcompflowRepository = bouqcompflowRepository;
    }

    public List<Bouqcompflow> getAll() {
        Iterable<Bouqcompflow> queryResult = bouqcompflowRepository.findAll();
        return StreamSupport.stream(queryResult.spliterator(), false)
                .collect(Collectors.toList());
    }
}