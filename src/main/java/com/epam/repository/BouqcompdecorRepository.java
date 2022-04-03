package com.epam.repository;

import com.epam.entity.Bouqcompdecor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BouqcompdecorRepository extends CrudRepository<Bouqcompdecor, String> {
}