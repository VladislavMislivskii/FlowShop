package com.epam.repository;

import com.epam.entity.Route;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository  extends CrudRepository<Route, String> {
}