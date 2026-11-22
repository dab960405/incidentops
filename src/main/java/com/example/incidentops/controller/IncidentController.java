package com.example.incidentops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IncidentController {

    @GetMapping("/api/incidents")
    public List<String> getAllIncidents() {
        return List.of();
    }
}
