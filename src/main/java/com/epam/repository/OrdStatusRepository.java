package com.epam.repository;


import com.epam.entity.OrdStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdStatusRepository  extends CrudRepository<OrdStatus, String> {

}