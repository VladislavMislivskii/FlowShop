package com.epam.repository;

import com.epam.entity.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface FlowerRepository extends CrudRepository<Flower, String> {
    Flower findFirstByOrderByIdDesc();
    Flower findById(Long id);
    @Transactional
    void deleteById(Long id);
}

