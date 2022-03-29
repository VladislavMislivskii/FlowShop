package com.epam.repository;

import com.epam.entity.CourType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourTypeRepository  extends CrudRepository<CourType, String> {
}
