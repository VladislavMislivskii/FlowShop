package com.epam.repository;

import com.epam.entity.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository  extends CrudRepository<Position, String> {
}

