package com.epam.repository;

import com.epam.entity.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlowerRepository extends CrudRepository<Flower, Long> {
    List<Flower> findFirstByOrderByIdDesc();
}

