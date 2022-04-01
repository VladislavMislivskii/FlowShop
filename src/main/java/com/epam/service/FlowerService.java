package com.epam.service;

import com.epam.entity.Flower;
import com.epam.entity.Flower;
import com.epam.repository.FlowerRepository;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class FlowerService {
    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getAll() {
        Iterable<Flower> queryResult = flowerRepository.findAll();

        return StreamSupport.stream(queryResult.spliterator(), false)
                .collect(Collectors.toList());
    }

    public void create(Flower flower) {
        flowerRepository.save(flower);
    }

    public List<Flower> list() {

        return (List<Flower>) flowerRepository.findAll();
    }


    public void deleteById(long FlowerId) {
        flowerRepository.deleteById(FlowerId);
    }

    public Optional<Flower> findById(Long flowerId) {
        return (Optional<Flower>) flowerRepository.findById(flowerId);
    }
}
