package com.epam.repository;

import com.epam.entity.Bouqcompflow;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BouqcompflowRepository extends CrudRepository<Bouqcompflow, String> {
}
