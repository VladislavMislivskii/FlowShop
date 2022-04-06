package com.epam.service;

import com.epam.dto.ReqStatusDTO;
import com.epam.entity.ReqStatus;
import com.epam.repository.ReqStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ReqStatusService {
    private final ReqStatusRepository reqStatusRepository;

    @Autowired
    public ReqStatusService(ReqStatusRepository reqStatusRepository) {
        this.reqStatusRepository = reqStatusRepository;
    }

    public List<ReqStatusDTO> getAll() {
        Iterable<ReqStatus> queryResult = reqStatusRepository.findAll();
        return StreamSupport.stream(queryResult.spliterator(), false)
                .map(ReqStatusDTO::new)
                .collect(Collectors.toList());
    }

}
