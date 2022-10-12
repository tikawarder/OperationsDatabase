package com.epam.database.service;

import com.epam.database.domain.Operation;
import com.epam.database.entity.ReportMovement;
import com.epam.database.repository.OperationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaverService {

    @Autowired
    OperationsRepository repository;

    public void saveOperations(List<ReportMovement> movements){
        repository.saveAll(movements);
    }
}
