package com.epam.database.integration;

import com.epam.database.entity.ReportMovement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class OperationsIntegration {
    private static final String BASE_URL = "http://localhost:8080/elevator";

    @Autowired
    RestTemplate restTemplate;

    public List<ReportMovement> getOperations() {
        return restTemplate.getForObject(BASE_URL + "/getmovements", List.class);
    }
}
