package com.epam.repository;

import com.epam.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository  extends CrudRepository<Client, String> {
    public Iterable<Client> findById(Long Id);
    public Client findByEmail(String Email);
    public Client findByPhone(String Phone);
}
