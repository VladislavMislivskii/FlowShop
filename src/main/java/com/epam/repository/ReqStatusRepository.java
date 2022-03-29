package com.epam.repository;

import com.epam.entity.ReqStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReqStatusRepository extends CrudRepository<ReqStatus, String> {
}
