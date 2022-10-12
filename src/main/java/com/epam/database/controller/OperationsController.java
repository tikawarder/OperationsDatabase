package com.epam.database.controller;

import com.epam.database.entity.ReportMovement;
import com.epam.database.service.SaverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/operations")
public class OperationsController {

    @Autowired
    SaverService service;

    @PostMapping("/movements")
    public ResponseEntity.BodyBuilder postOperations(@RequestBody List<ReportMovement> movements){
        service.saveOperations(movements);
        return ResponseEntity.status(HttpStatus.CREATED);
    }

}
