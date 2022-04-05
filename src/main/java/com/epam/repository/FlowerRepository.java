package com.epam.repository;

import com.epam.entity.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends CrudRepository<Flower, Long> {
    Flower findFirstByOrderByIdDesc();
}

