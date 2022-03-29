package com.epam.repository;

import com.epam.entity.Transport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransportRepository  extends CrudRepository<Transport, String> {
}