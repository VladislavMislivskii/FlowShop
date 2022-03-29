package com.epam.repository;

import com.epam.entity.Bouquet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BouquetRepository extends CrudRepository<Bouquet, String> {
}
