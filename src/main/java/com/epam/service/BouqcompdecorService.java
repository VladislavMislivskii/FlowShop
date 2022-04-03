package com.epam.service;

import com.epam.entity.Bouqcompdecor;
import com.epam.repository.BouqcompdecorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BouqcompdecorService {
    private final BouqcompdecorRepository bouqcompdecorRepository;

    @Autowired
    public BouqcompdecorService(BouqcompdecorRepository bouqcompdecorRepository) {
        this.bouqcompdecorRepository = bouqcompdecorRepository;
    }

    public List<Bouqcompdecor> getAll() {
        Iterable<Bouqcompdecor> queryResult = bouqcompdecorRepository.findAll();
        return StreamSupport.stream(queryResult.spliterator(), false)
                .collect(Collectors.toList());
    }
}