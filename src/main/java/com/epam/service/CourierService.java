package com.epam.service;

import com.epam.entity.Courier;
import com.epam.repository.CourierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;



@Service
public class CourierService {
    private final CourierRepository courierRepository;

    @Autowired
    public CourierService(CourierRepository courierRepository) {
        this.courierRepository = courierRepository;
    }

    public List<Courier> getAll() {
        Iterable<Courier> queryResult = courierRepository.findAll();
        return StreamSupport.stream(queryResult.spliterator(), false)
                .collect(Collectors.toList());
    }
}