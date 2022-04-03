package com.epam.service;

import com.epam.entity.Bouquet;
import com.epam.repository.BouquetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BouquetService {
    private final BouquetRepository bouquetRepository;

    @Autowired
    public BouquetService(BouquetRepository bouquetRepository) {
        this.bouquetRepository = bouquetRepository;
    }

    public List<Bouquet> getAll() {
        Iterable<Bouquet> queryResult = bouquetRepository.findAll();
        return StreamSupport.stream(queryResult.spliterator(), false)
                .collect(Collectors.toList());
    }
}
