package com.epam.service;

import com.epam.entity.Decoration;
import com.epam.repository.DecorationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class DecorationService {
    private final DecorationRepository decorationRepository;

    @Autowired
    public DecorationService(DecorationRepository decorationRepository) {
        this.decorationRepository = decorationRepository;
    }

    public List<Decoration> getAll() {
        Iterable<Decoration> queryResult = decorationRepository.findAll();

        return StreamSupport.stream(queryResult.spliterator(), false)
                .collect(Collectors.toList());
    }
}
