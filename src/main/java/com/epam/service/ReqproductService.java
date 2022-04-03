package com.epam.service;

import com.epam.entity.Reqproduct;
import com.epam.repository.ReqproductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ReqproductService {
    private final ReqproductRepository reqproductRepository;

    @Autowired
    public ReqproductService(ReqproductRepository reqproductRepository) {
        this.reqproductRepository = reqproductRepository;
    }

    public List<Reqproduct> getAll() {
        Iterable<Reqproduct> queryResult = reqproductRepository.findAll();
        return StreamSupport.stream(queryResult.spliterator(), false)
                .collect(Collectors.toList());
    }
}