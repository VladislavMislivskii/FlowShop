package com.epam.repository;

import com.epam.entity.Client;
import com.epam.entity.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends CrudRepository<Request, String> {
    public List<Request> findFirstByOrderByIdDesc();
    public List<Request> findByClient(Client сlient);
}