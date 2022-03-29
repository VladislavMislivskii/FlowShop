package com.epam.repository;

import com.epam.entity.Courier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourierRepository  extends CrudRepository<Courier, String> {
}