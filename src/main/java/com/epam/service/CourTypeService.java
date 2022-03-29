package com.epam.service;
import com.epam.entity.CourType;
import com.epam.repository.CourTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@Service
public class CourTypeService {
    private final CourTypeRepository courTypeRepository;

    @Autowired
    public CourTypeService(CourTypeRepository courTypeRepository) {
        this.courTypeRepository = courTypeRepository;
    }

    public List<CourType> getAll() {
        Iterable<CourType> queryResult = courTypeRepository.findAll();
        return StreamSupport.stream(queryResult.spliterator(), false)
                .collect(Collectors.toList());
    }
}