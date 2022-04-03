package com.epam.repository;

import com.epam.entity.Reqproduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReqproductRepository extends CrudRepository<Reqproduct, String> {
}
