package com.epam.repository;

import com.epam.entity.Decoration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecorationRepository extends CrudRepository<Decoration, String> {
}
